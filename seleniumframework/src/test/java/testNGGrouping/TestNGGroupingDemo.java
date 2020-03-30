package testNGGrouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

//@Test(groups={"AllClassTest"})
//we can create groups at the class level as well	

public class TestNGGroupingDemo {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("sanity only");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("sanity & smoke");
	}
	@Test(groups = {"sanity","windows.regression"})
	public void test3() {
		System.out.println("regression & sanity");
	}
	@Test(groups= {"mac.regression"})
	public void test4() {
		System.out.println("test4");
	}
	 
}
/*Why to create Groups
How to create test Groups
How to run tests from groups
How to include / exclude groups

How to create MetaGroups
How to use regular expression
How to define groups at class level

What is Grouping

Grouping is a feature in TestNG where we can assign tests or classes to one or more group.

During execution, we can define what groups to include or exclude

This makes test management and execution very easy and efficient

Meta Group is a custom group
*/
