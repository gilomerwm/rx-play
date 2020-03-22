package Examples;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Zip combine the emissions of multiple Observables together
 * via a specified function and emit single items for each
 * combination based on the results of this function
 */
public class ZipExamples {

	public List<String> zip(String[] arr1, String[] arr2){
		List<String> zippedStrings = new ArrayList<>();

		Observable.zip(
				Observable.fromArray(arr1),
				Observable.fromArray(arr2),
				(str1, str2) -> str1 + " " + str2).subscribe(zippedStrings::add);

		return zippedStrings;
	}

}
