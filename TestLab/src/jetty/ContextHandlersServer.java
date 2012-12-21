package jetty;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;

public class ContextHandlersServer {
	public static void main(String[] args) throws Exception{
		Server server = new Server(9002);
		ContextHandler ch = new ContextHandler();
		ch.setContextPath("/hello");
		ch.setHandler(new HelloHandler());
		ch.setResourceBase(".");
		ch.setClassLoader(Thread.currentThread().getContextClassLoader());
		
		ContextHandler ch2 = new ContextHandler();
		ch2.setContextPath("/bye");
		ch2.setHandler(new ByeHandler());
		ch2.setClassLoader(Thread.currentThread().getContextClassLoader());
		ch2.setResourceBase(".");
		
		HandlerList hl = new HandlerList();
		hl.setHandlers(new Handler[]{ch,ch2});
		server.setHandler(ch2);
		//server.setHandler(ch);
		server.start();
		server.join();
	}
}
