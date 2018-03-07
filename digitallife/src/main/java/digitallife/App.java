package digitallife;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static Logger logger = Logger.getLogger(App.class);
	
	static String log4jpath = "C:/DigitalLife_SeleniumTestNG/digitallife/common/src/main/resources/log4j.properties";
			
    public static void main( String[] args )
    {	
    	//BasicConfigurator.configure();
    	
    	PropertyConfigurator.configure(log4jpath); 

    	logger.info("Classic Log4j Configured !!");
        System.out.println( "Hello World!" );
        logger.warn("This is warn" );
		logger.error("This is error");
		logger.fatal("This is fatal");
    }
}
