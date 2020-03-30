package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListenersDemo.class )//if you want to add more listenesrs class then use this format ({class1,class2})

public class TestNGListenersTest3 {
	@Test
	public void test1() {
		System.out.println("I am insude test1");
	}
	@Test
	public void test2() {
		System.out.println("I am insude test2");
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am insude test3");
		throw new SkipException("test3 is skipped");
	}

}
