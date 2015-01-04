package part2;

public class WasRun extends TestCase{
	
	boolean wasRun;
	boolean wasSetUp;
	
	WasRun(String methodName){
		super(methodName);
		wasRun = false;
	}
	
	public void testMethod(){
		wasRun = true;
	}

	public void setUp(){
		wasRun = false;
		this.wasSetUp=true;
	}

}
