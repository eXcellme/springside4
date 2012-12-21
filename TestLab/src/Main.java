import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jetty.HelloHandler;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.nio.SelectChannelConnector;


public class Main {
	// 建立一个可以处理简单请求的jetty服务器
	public static void main(String[] args) throws Exception {
		Server server = new Server(8091);
		SelectChannelConnector connector = new SelectChannelConnector();
		server.setHandler(new HelloHandler());
		
		server.start();
	}
}
