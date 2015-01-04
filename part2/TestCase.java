package part2;

public class TestCase {
	
	String name;
	
	TestCase(String name){
		this.name = name;
	}
	
	public void run() throws Exception{
		this.getClass().getMethod("testMethod").invoke(this);
	}
}
