package part2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	@Test
	public void testRunning() throws Exception {
		WasRun wasRun = new WasRun("testMethod");
		assertFalse(wasRun.wasRun);
		wasRun.run();
		assertTrue(wasRun.wasRun);
	}

}
