package Examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombineLatestExamplesTest {

	CombineLatestExamples theUnit = new CombineLatestExamples();

	@Test
	public void testCombineLatest(){
		String[] letters = {"a", "b", "c"};
		Integer[] numbers = { 1, 2, 3};
		assertEquals("c1c2c3",theUnit.combineLatest(letters, numbers));
	}
}
