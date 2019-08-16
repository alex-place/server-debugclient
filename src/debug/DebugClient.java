package debug;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.esotericsoftware.kryonet.Client;

import core.pojos.SomeRequest;
import core.register.SerializeRegister;

public class DebugClient extends Client {
	
	Logger LOGGER = Logger.getLogger(DebugClient.class);


	public void init() throws IOException {
		start();
		connect(5000, "127.0.0.1", 45565, 45566);
		SerializeRegister.init(this, null);
	}

	public void testRequest() {
		SomeRequest request = new SomeRequest();
		request.text = "Here is the request";
		LOGGER.info(request.text);
		sendTCP(request);
	}

}
