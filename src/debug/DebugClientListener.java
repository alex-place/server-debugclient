package debug;

import org.apache.log4j.Logger;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

import core.pojos.SomeResponse;

public class DebugClientListener extends Listener {
	Logger LOGGER = Logger.getLogger(DebugClientListener.class);

	@Override
	public void received(Connection connection, Object object) {
		if (object instanceof SomeResponse) {
			SomeResponse request = (SomeResponse) object;
			LOGGER.info(request.text);
		}
	}
}
