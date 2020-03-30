package testNGRerunFailedTest;

import org.testng.annotations.Test;
import org.testng.Assert;


public class ReRunFailedTestDemo {
	@Test
	public void test1() {
		System.out.println("i am inside test 1");
	}
	@Test
	public void test2() {
		System.out.println("i am inside test 2");
		int i=1/0;

	}
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("i am inside test 3");
		Assert.assertTrue(false);
	}

}
/*How to re-run failed tests | manually (GO to test-output in project path, look for testng-failed.xml, run this XML as a testNGSuite 
How to re-run failed tests | automated
How to retry a tests just after failure*/
