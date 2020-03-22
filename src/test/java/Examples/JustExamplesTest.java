package Examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class JustExamplesTest {

	JustExamples theUnit = new JustExamples();
	@Rule public TestName name = new TestName();

	@Test
	public void justFromFlowableTest() {
		System.out.println(name.getMethodName()+":");
		theUnit.justFromFlowable();
	}

	@Test
	public void justFromObservableTest() {
		System.out.println(name.getMethodName()+":");
		theUnit.justFromObservable();
	}
	
}
