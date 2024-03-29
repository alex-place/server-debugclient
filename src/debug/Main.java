package debug;

import org.apache.log4j.Logger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		ExceptionListener listener = new ExceptionListener();
		Thread.setDefaultUncaughtExceptionHandler(listener);
		Logger LOGGER = Logger.getLogger(Main.class);
		LOGGER.info("Launching Sloth Server Debug Client");
		DebugClient client = new DebugClient();
		client.addListener(new DebugClientListener());
		client.init();
		client.testRequest();
		
		do {
			
		}while(client.isConnected());
		
	}

}
