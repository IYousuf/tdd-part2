package part2;

public class TestCase {
	
	String name;
	public TestCase(){}
	TestCase(String name){
		this.name = name;
	}
	
	public void tearDown(){}

	public void setUp(){};
	
	public TestResult run() throws Exception{
		TestResult result = new TestResult();
		return run(result);
	}
	
	public TestResult run(TestResult result) throws Exception{
		result.testStarted();
		setUp();
		try{
			this.getClass().getMethod("testMethod").invoke(this);
		}catch(Exception ex){
			result.testFailed();
		}
		tearDown();
		return result;
	}
}
