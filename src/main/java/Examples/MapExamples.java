package Examples;

import io.reactivex.Observable;

/**
 * Applies the given io.reactivex.functions.Function
 * to each item emitted by a reactive source and
 * emits the results of these function applications.
 */
public class MapExamples {

	public void map1() {
		Observable.just(1, 2, 3)
				.map(x -> x * x)
				.subscribe(System.out::println);
	}
}
