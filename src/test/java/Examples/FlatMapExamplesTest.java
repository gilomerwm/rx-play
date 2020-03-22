package Examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class FlatMapExamplesTest {

	FlatMapExamples theUnit = new FlatMapExamples();
    @Rule public TestName name = new TestName();
	
	@Test
	public void test1() throws Exception {
		System.out.println(name.getMethodName());
		theUnit.flatMap1();
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println(name.getMethodName());
		theUnit.flatMap2();
	}

	@Test
	public void test3() throws Exception {
		System.out.println(name.getMethodName()+":");
		theUnit.flatMap3();
	}
	
	@Test
	public void test4() throws Exception {
		System.out.println(name.getMethodName()+":");
		theUnit.flatMapFilter();
	}
}
