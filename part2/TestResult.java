package part2;

public class TestResult {
	
	int runCount;
	int errorCount;
	
	TestResult(){
		runCount=0;
	}
	
	public void testStarted(){
		runCount++;
	}
	
	public void testFailed(){
		errorCount++;
	}
	
	public String summary(){
		return runCount+" run, "+errorCount+" failed";
	}

}
