package jetty.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public HelloServlet() {
		// TODO Auto-generated constructor stub
	}
	private String msg ;
	public HelloServlet(String msg){
		this.msg = msg ;
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().println("<h1>"+msg+"</h1>");
		
		resp.getWriter().println("session = "+req.getSession(true).getId());
	}
}
