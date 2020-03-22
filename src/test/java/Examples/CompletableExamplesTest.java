package Examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class CompletableExamplesTest {

	CompletableExamples theUnit = new CompletableExamples();

	@Rule
	public TestName name = new TestName();

	@Test
	public void completableConstruct() {
		System.out.println(name.getMethodName()+":");
		theUnit.constructCompletable();
	}

	@Test
	public void completableChain() {
		System.out.println(name.getMethodName()+":");
		theUnit.chainingCompletables();
	}

}
