package Examples;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

/**
 * Completable is similar to Observable with the
 * only exception that the former emits either
 * completion or error signals but no items.
 */
public class CompletableExamples {

	public void constructCompletable() {
		Flowable<String> flowable = Flowable
				.just("request received", "user logged in");

		Completable flowableCompletable = Completable
				.fromPublisher(flowable);

		Completable singleCompletable = Single.just(1)
				.ignoreElement();
	}

	public void chainingCompletables() {
		Completable first = Completable
				.fromSingle(Single.just(1));
		Completable second = Completable
				.fromRunnable(() -> {});
		Throwable throwable = new RuntimeException();
		Completable error = Single.error(throwable).ignoreElement();


		first.andThen(second).test().assertComplete();
		first.andThen(second).andThen(error).test().assertError(throwable);
	}
}
