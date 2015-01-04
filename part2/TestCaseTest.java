package part2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {
	
	
	public void setUp(){
	}
	
	@Test
	public void testRunning() throws Exception {
		WasRun test = new WasRun("testMethod");
		test.run();
		assertTrue(test.wasRun);
	}

	@Test
	public void testSetUp() throws Exception{
		WasRun test =  new WasRun("testMethod");
		test.run();
		assertTrue(test.wasSetUp);

	}
}
