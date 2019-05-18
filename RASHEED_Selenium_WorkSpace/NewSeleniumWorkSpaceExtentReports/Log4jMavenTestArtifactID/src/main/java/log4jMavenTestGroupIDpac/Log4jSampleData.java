package log4jMavenTestGroupIDpac;

import org.apache.log4j.Logger;

public class Log4jSampleData {
	
	public static Logger logger;
	public static void main(String args[])
	{
		 logger=Logger.getLogger("devpinoyLogger");
		logger.info("Rasheed");
	}
}
