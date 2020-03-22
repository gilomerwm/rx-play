package Examples;

import io.reactivex.Observable;

public class ObservableExamples {
	
	public void emittingItemsOnError() {
		Observable.create(emitter -> {
		     while (!emitter.isDisposed()) {
		         long time = System.currentTimeMillis();
		         emitter.onNext(time);
		         if (time % 2 != 0) {
		             emitter.onError(new IllegalStateException("Odd millisecond!"));
		             break;
		         }
		     }
		})
		.subscribe(System.out::println, Throwable::printStackTrace);
	}
}
