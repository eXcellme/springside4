package jetty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloHandler extends AbstractHandler{

	@Override
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String baseUri = baseRequest.getRequestURI();
		String reqUri = request.getRequestURI();
		String qStr = request.getQueryString();
		
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(200);
		baseRequest.setHandled(true);
		response.getWriter().println("<h1>Hello World!<h1>");
		response.getWriter().println("<h2>Your baseUri is "+baseUri+"</h2>");
		response.getWriter().println("<h2>Your reqUri is "+reqUri+"</h2>");
		response.getWriter().println("<h2>Your qStr is "+qStr+"</h2>");
	}
}
		
