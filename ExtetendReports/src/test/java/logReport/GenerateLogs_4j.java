package logReport;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class GenerateLogs_4j {
	
	public Logger loger;
	@Test
	public void logs() {
		
		//log reports and we need to create a properties file as log4j2.properties
		loger=LogManager.getLogger(GenerateLogs_4j.class);
		System.out.println("invoked sucess");
		
		loger.info("invoked");
	}

}
