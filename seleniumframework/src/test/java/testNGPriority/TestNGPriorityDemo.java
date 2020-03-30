package testNGPriority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("i am inside 1");
		
	}
	@Test(priority = -2)
	public void test2() {
		System.out.println("i am inside 2");
		
	} 
	@Test(priority = -1)
	public void test3() {
		System.out.println("i am inside 3");
		
	}

}
//if we have priortized and non-priortized methods then it will run the non priortized method first then it will go for priortized method
//if there is no priortiy then it will run my alphabetical oderder and not based on the method sequence
//when two methods have same priority  then alphabetical order is considered, if the first letter is same then it will priortize the run based on the second letter of the test method name
//Run lowest number first
//Priority start from 0, if we set priortiy as 0 then it will execute the method which has priority set as 0
/*Sequence of execution when
When 2 or more tests have same priority
When a class has both prioritized and non-prioritized methods
When a class has no prioritized methods

helpful tips

Priority Parameter

@Test(priority=1)

What if two test methods have same priority
- Will run as per alphabetical order
- If No priority then alphabetical order

What if a class has both prioritised and non-prioritised methods
- First non-prioritised methods will be executed in alphabetical order
*/