package testNGDependencies;

import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.Test;

public class TestNGDependenciesDemo {
	@Test(dependsOnMethods = {"test2","test3"})
	//(dependsOnGroups ="sanity")
	public void test1() {
		System.out.println("i am inside test 1");
		
	}
	@Test(priority =1)
	//(groups="sanity")
	public void test2() {
		System.out.println("i am inside test 2 ");
		
	}
	@Test()
	public void test3() {
		System.out.println("i am inside test 3 ");
		
	}
	

}
/*1 How to create test dependencies

2 What happens when tests have priority set

3 How to create dependencies on multiple tests

4 How to create group dependencies

5 Using regular expressions*/
