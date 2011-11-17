package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoServlet extends HttpServlet {

	private List<String> names;
	
	@Override
	public void init() {
		
		 names = new ArrayList<String>();
	}

	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response) {
		try {
			
			String name = request.getParameter("name");
			PrintWriter out = response.getWriter();
			out.println("Hello " + name + " dude check out all these people who have visited!");
			
			for( String otherName : names) {
				out.println(otherName);
			}
			out.close();
			names.add(name);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
