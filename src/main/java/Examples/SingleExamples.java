package Examples;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * The Single class represents the single value response.
 * Single observable can only emit either
 * a single successful value or an error.
 * It does not emit onComplete event.
 */
public class SingleExamples {

	public void single1() {
		Single.just("single").subscribe(System.out::println);
	}

	public void single2() throws InterruptedException {
		//Create the observable
		Single<String> testSingle = Single.just("from single");

		//Create an observer
		Disposable disposable = testSingle
				.delay(2, TimeUnit.SECONDS, Schedulers.io())
				.subscribeWith(
						new DisposableSingleObserver<String>() {

							@Override
							public void onError(Throwable e) {
								e.printStackTrace();
							}

							@Override
							public void onSuccess(String value) {
								System.out.println("Success: "+value);
							}
						});

		Thread.sleep(3000);

		//start observing
		disposable.dispose();
	}

}
