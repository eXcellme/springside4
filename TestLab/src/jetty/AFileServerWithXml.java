package jetty;

import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.xml.XmlConfiguration;

public class AFileServerWithXml {
	public static void main(String[] args) throws Exception {
		Resource f = Resource.newSystemResource("fileserver.xml");
		XmlConfiguration conf = new XmlConfiguration(f.getInputStream());
		Server server = (Server)conf.configure();
		server.start();
		server.join();
	}
}
