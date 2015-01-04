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
		assertTrue(test.log.equals("setUp testMethod tearDown "));
	}
	
	@Test
	public void testResult() throws Exception{
		WasRun test =  new WasRun("testMethod");
		TestResult testResult = test.run();
		assertTrue(testResult.summary().equals("1 run, 0 failed"));
	}
	
	@Test
	public void testFailedResult() throws Exception{
		WasRun test =  new WasRun("testMethod");
		TestResult testResult = test.run();
		assertFalse(testResult.summary().equals("1 run, 1 failed"));
	}
	
	@Test
	public void testFailedResultFormatting(){
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		assertTrue(result.summary().equals("1 run, 1 failed"));
	}
	
}
