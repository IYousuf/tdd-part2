package part2;

public class WasRun extends TestCase{
	
	boolean wasRun;
	
	WasRun(String methodName){
		super(methodName);
		wasRun = false;
	}
	
	public void testMethod(){
		wasRun = true;
	}


}
