package Examples;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.Arrays;
import java.util.List;

public class ZipExamplesTest {

	ZipExamples theUnit = new ZipExamples();

	@Rule
	public TestName name = new TestName();

	@Test
	public void testZip() {
		String[] arr1={"a","b","c"};
		String[] arr2 ={"1","2","3", "NonZipperElement1", "NonZipperElement2", "NonZipperElement3"};
		List<String> zippedStrings = theUnit.zip(arr1, arr2);

		System.out.println(zippedStrings);

		assertTrue(!zippedStrings.isEmpty());
		assertTrue(zippedStrings.size()==Math.min(arr1.length,arr2.length));
		assertTrue(zippedStrings.contains("a 1")&&zippedStrings.contains("b 2")&&zippedStrings.contains("c 3"));
	}

}
