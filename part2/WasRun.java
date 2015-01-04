package part2;

public class WasRun extends TestCase{
	
	boolean wasRun;
	String log;
	
	WasRun(String methodName){
		super(methodName);
		wasRun = false;
	}
	
	public void testMethod(){
		wasRun = true;
		log = log +"testMethod ";
	}

	@Override
	public void setUp(){
		wasRun = false;
		log = "setUp ";
	}
	
	@Override
	public void tearDown(){
		log = log+"tearDown ";
	}

}
