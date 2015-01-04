package part2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {
	
	
	public void setUp(){
	}
	
	@Test
	public void testTemplateMethod() throws Exception{
		WasRun test =  new WasRun("testMethod");
		test.run();
		test.tearDown();
		assertTrue(test.log.equals("setUp testMethod tearDown "));

	}
}
