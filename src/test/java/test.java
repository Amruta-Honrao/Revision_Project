import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test extends parent {

	 private static final Logger logger = LogManager.getLogger(test.class);
	@Parameters ("browser")
	@Test 
	
	public void check(@Optional("Chrmome") String browser)
	{
		System.out.println("browser is " + browser + "and thread is " + Thread.currentThread().getId());
		logger.info("Test started hello");
	}


}
