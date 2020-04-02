package testNGIgnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore (Will ignore the test at class level)
public class TestNGIgnoreDemo {

	@Ignore
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test2");
	}

	@Test
	public void test3() {
		System.out.println("I am inside test3");
	}
}
/*How to ignore tests
How to ignore all tests in a class
How to ignore all tests inside a package*/

//Ignore the test at the pacakge level
//1.Create a package with same in the corresponding folder by enbaling the check box "Create pacakge-info.java"
//then add @ignore above the package
//if run any test under this pacakge then it will be ignored 