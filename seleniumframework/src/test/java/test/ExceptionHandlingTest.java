package test;

public class ExceptionHandlingTest {
	public static void main(String[] args) {
		try {
			System.out.println("Hello WOrld.....!");
			int i=1/0;
			System.out.println("Completed!!!");
			
		}catch(Exception e) {
			System.out.println("I am inside the catch block");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			
		}//You can have many catch block or No catch block but finally block is mandatory 
		finally {
			System.out.println("I am inside the final");
			
		}
		
	}

}
/*Exception
unexpected condition at runtime

Exception Handling
Handling any unexpected behavior during execution
Catch the exception and log messages for troubleshooting
Enables continuation of runs even if a test fails
*/