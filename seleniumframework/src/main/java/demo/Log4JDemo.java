package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	private static Logger logger = LogManager.getLogger(Log4JDemo.class);
	public static void main(String[] args) {
		System.out.println("\n Hello World.....!  \n");
		logger.trace("This is a Trace message");
		logger.info("This is an Information");	
		logger.error("This is an Error Message");
		logger.warn("This is an Warming message");
		logger.fatal("This is a fatal error");
		System.out.println("\n Completed");

	}
}