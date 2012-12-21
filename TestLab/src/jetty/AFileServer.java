package jetty;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.nio.SelectChannelConnector;

/**
 * Java代码版文件服务器的实现
 * @author bm
 *
 */
public class AFileServer {
	public static void main(String[] args) throws Exception {
		Server server = new Server();
		SelectChannelConnector c = new SelectChannelConnector();
		c.setPort(9001);
		server.addConnector(c);
		ResourceHandler rh = new ResourceHandler();
		rh.setDirectoriesListed(true);
		rh.setWelcomeFiles(new String[]{"index.xml"});
		
		rh.setResourceBase(".");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[]{rh,new DefaultHandler()});
		server.setHandler(handlers);
		
		server.start();
		server.join();
	}
}
