package part2;

public class TestCase {
	
	String name;
	
	TestCase(String name){
		this.name = name;
	}
	
	abstract public void tearDown();

	abstract public void setUp();
	
	public void run() throws Exception{
		setUp();
		this.getClass().getMethod("testMethod").invoke(this);
	}
}
