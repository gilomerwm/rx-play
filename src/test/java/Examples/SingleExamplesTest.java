package Examples;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class SingleExamplesTest {

	SingleExamples theUnit = new SingleExamples();
	
	@Rule
	public TestName name = new TestName();
	
	@Test
	public void test1() {
		System.out.println("\n"+name.getMethodName()+":");
		theUnit.single1();
	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("\n"+name.getMethodName()+":");
		theUnit.single2();
	}

}
