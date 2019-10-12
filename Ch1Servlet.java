import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.*;
import javax.servlet.*;


public class Ch1Servlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		Date today = new Date();
		out.println("<html>" + "<body>"
		+ "<h1 align=center>HF\\’s Chapter1 Servlet</h1>"
		+ "<br>" + today + "</body>" + "</html>");
	}
	
}
