package Examples;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


public class MapExamplesTest {

	MapExamples theUnit = new MapExamples();

	@Rule
	public TestName name = new TestName();

	@Test
	public void completableConstruct() {
		theUnit.map1();
	}

}
