package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListenersDemo.class )//if you want to add more listenesrs class then use this format ({class1,class2})

public class TestNGListenersTest2 {
	@Test
	public void test7() {
		System.out.println("I am insude test7");
	}
	@Test
	public void test8() {
		System.out.println("I am insude test8");
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void test9() {
		System.out.println("I am insude test9");
		throw new SkipException("test3 is skipped");
	}

}
