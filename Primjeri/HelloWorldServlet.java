package Primjeri;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Hello World Servlet", urlPatterns = {"/HelloWorldServlet"})

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// napraviti novi PrintWriter objekt za ispis odgovora
		PrintWriter out = response.getWriter();

		// odgovor za ispisati u browseru
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello World</h1>");
		out.println("<p>Simple servlet</p>");
		out.println("</body>");
		out.println("</html>");

		// zatvoriti PrintWriter
		out.close();

	}

}