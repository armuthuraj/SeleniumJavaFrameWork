package testNGParameterize;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterizeDemo {
	@Test
	@Parameters({"myName"})
	public void test(String name)/*public void test(@Optional("Charter") String name)*/ {
		System.out.println("My Name is  : "+name);
	}

}

//When we declare the parameter is optional it will not fail the test instead it will pass the value as "Null"
/*1 How to parameterize tests
2 How to run tests with parameters
3 How to make parameters Optional

helpful tips

@Parameters annotation can be placed on any method that already has following annotations

@Test
@Before/After
@Factory


@Parameters annotation can also be placed class constructor
In testng.xml you can put parameters under suite or test tag


If two parameters have the same name, it's the one defined in test that has precedence. 
This is convenient if you need to specify a parameter applicable to all your tests and override its value only for certain tests.

*/
