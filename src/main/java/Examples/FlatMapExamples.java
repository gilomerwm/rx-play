package Examples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.reactivex.Observable;

/**
 * Applies the given io.reactivex.functions.Function
 * to each item emitted by a reactive source,
 * where that function returns a reactive source,
 * and emits the items that result from merging the results of these function applications.
 */
public class FlatMapExamples {
	
	public void flatMap1() throws Exception {
		Observable.range(1, 10)
		.flatMap(v -> Observable.just(v).delay(11 - v, TimeUnit.MICROSECONDS))
		.subscribe(System.out::println);
	}
	
	public void flatMap2() throws Exception {
		Observable.range(1, 10)
		.flatMap(v -> {
		    if (v < 5) {
		        return Observable.just(v * v);
		    }
		    return Observable.<Integer>error(new IOException("Why not?!"));
		})
		.subscribe(System.out::println, Throwable::printStackTrace);
	}

	public void flatMap3() {
		Observable.just("A", "B", "C")
				.flatMap(a -> {
					return Observable.intervalRange(1, 3, 0, 1, TimeUnit.SECONDS)
							.map(b -> '(' + a + ", " + b + ')');
				})
				.blockingSubscribe(System.out::println);
	}

	public void flatMapFilter() throws Exception {
		Observable.range(1, 20)
		.flatMap(v -> {
			return Observable.just(v * v);
		}).filter(v->v%2==0)
		.subscribe(System.out::println, Throwable::printStackTrace);
	}

}
