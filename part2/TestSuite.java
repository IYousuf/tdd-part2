package part2;

import java.util.ArrayList;

public class TestSuite {

	ArrayList<WasRun> list = new ArrayList<WasRun>();
	
	public void add(WasRun wasRun){
		list.add(wasRun);
	}
	
	public TestResult run(TestResult result) throws Exception{
		for(WasRun wasRun : list){
			wasRun.run(result);
		}
		return result;
	}
}
