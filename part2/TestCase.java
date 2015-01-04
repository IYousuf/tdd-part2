package part2;

public class TestCase {
	
	String name;
	
	TestCase(String name){
		this.name = name;
	}
	
	public void setUp(){
	}
	
	public void run() throws Exception{
		setUp();
		this.getClass().getMethod("testMethod").invoke(this);
	}
}
