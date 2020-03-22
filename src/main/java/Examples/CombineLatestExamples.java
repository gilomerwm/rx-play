package Examples;

import io.reactivex.Observable;

public class CombineLatestExamples {

	public String combineLatest(String[] letters, Integer[] numbers) {
		final StringBuilder result = new StringBuilder();
		Observable<String> observable1 = Observable.fromArray(letters);
		Observable<Integer> observable2 = Observable.fromArray(numbers);
		Observable.combineLatest(observable1, observable2, (a,b) -> a + b)
				.subscribe( letter -> result.append(letter));
		return result.toString();
	}
}
