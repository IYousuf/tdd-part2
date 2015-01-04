package part2;

public class TestCase {
	
	String name;
	
	TestCase(String name){
		this.name = name;
	}
	
	abstract public void tearDown();

	abstract public void setUp();
	
	public TestResult run() throws Exception{
		TestResult result = new TestResult();
		result.testStarted();
		setUp();
		this.getClass().getMethod("testMethod").invoke(this);
		return result;
	}
}
