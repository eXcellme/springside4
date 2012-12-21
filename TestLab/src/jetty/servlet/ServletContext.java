package jetty.servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServletContext {
	public static void main(String[] args)throws Exception {
		System.out.println(ServletContext.class.getName());
		Server server = new Server(9003);
		 
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
 
        context.addServlet(new ServletHolder(new HelloServlet()),"/*");
        context.addServlet(new ServletHolder(new HelloServlet("Buongiorno Mondo")),"/it/*");
        context.addServlet(new ServletHolder(new HelloServlet("Bonjour le Monde")),"/fr/*");
        context.addServlet(new ServletHolder(new HelloServlet("ÄãºÃ")),"/cn/*");
        context.addServlet(new ServletHolder(new HelloServlet("Hello")),"/en/*");
        
        server.start();
        server.join();
	}
}
