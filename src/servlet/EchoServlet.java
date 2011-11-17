package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoServlet extends HttpServlet {
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("Hello " + name + " dude check out all these people who have visited!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
