package Examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class MaybeExamplesTest {

	MaybeExamples theUnit = new MaybeExamples();

	@Rule
	public TestName name = new TestName();

	@Test
	public void maybeTest1() {
		System.out.println(name.getMethodName()+":");
		theUnit.maybe1();
	}
}
