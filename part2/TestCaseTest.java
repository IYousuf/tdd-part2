package part2;

public class TestCaseTest extends TestCase {

	private TestResult result ;

	
	TestCaseTest(String name) {
		super(name);
	}

	public void setUp(){
		result = new TestResult();
	}
	
	public void testTemplateMethod() throws Exception{
		WasRun test =  new WasRun("testMethod");
		test.run(result);
		assert(test.log.equals("setUp testMethod tearDown "));
	}
	
	public void testResult() throws Exception{
		WasRun test =  new WasRun("testMethod");
		test.run(result);
		assert(result.summary().equals("1 run, 0 failed"));
	}
	
	public void testFailedResult() throws Exception{
		WasRun test =  new WasRun("testMethod");
		test.run(result);
		assert(result.summary().equals("1 run, 1 failed"));
	}
	
	public void testFailedResultFormatting(){
		result.testStarted();
		result.testFailed();
		assert(result.summary().equals("1 run, 1 failed"));
	}
	
	public void testSuite() throws Exception{
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(result);
		assert("2 run, 1 failed" == result.summary());
	}
	
    public static void main(String[] args) throws Exception {
        TestSuite suite = new TestSuite();
        TestResult result = new TestResult();
        suite.add(new WasRun("testTemplateMethod"));
        suite.add(new WasRun("testResult"));
        suite.add(new WasRun("testFailedResultFormatting"));
        suite.add(new WasRun("testFailedResult"));
        suite.add(new WasRun("testSuite"));
        suite.run(result);
        System.out.println(result.summary());
    }
	
}
