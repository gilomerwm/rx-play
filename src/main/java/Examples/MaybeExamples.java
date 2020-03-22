package Examples;

import io.reactivex.Maybe;


/**
 * Maybe is similar to Single
 * only difference being that it allows for no emissions as well.
 */
public class MaybeExamples {

	public void maybe1() {
		Maybe.empty()
				.subscribe( System.out::println,
							System.out::println,
							() -> System.out.println("onComplete"));

		Maybe.just("hello")
				.subscribe( System.out::println,
							System.out::println,
							() -> System.out.println("onComplete"));
	}

}
