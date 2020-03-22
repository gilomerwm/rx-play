package Examples;

import io.reactivex.Flowable;
import io.reactivex.Observable;

public class JustExamples {

	/**
	 * Just - Returns a Flowable that signals the given
	 * (constant reference) item and then completes.
	 */
	public void justFromFlowable() {
		Flowable.just("Hello world").subscribe(System.out::println);
	}


	public void justFromObservable() {
		Observable.just(1, 2, 3).subscribe(System.out::println);
	}
}


