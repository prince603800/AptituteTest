package demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1
 */
@WebServlet("/Page1")
public class Page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  RequestDispatcher rd;
		int i = RandomGenerator.rangen();
		 
		switch(i) {
        case 0:
        	   rd=request.getRequestDispatcher("page1a.html");  
              rd.forward(request, response);  
            break;
        case 1:
        	 rd = request.getRequestDispatcher("page1b.html");
            rd.include( request, response);
            break;
        case 2:
        	rd = request.getRequestDispatcher("page1c.html");
            rd.include( request, response);
            break;
        case 3:
        	rd = request.getRequestDispatcher("page1d.html");
        	rd.include( request, response);
            break;
        case 4:
        	rd = request.getRequestDispatcher("page1e.html");
        	rd.include( request, response);
            break;
        case 5:
        	rd = request.getRequestDispatcher("page1f.html");
        	rd.include( request, response);
            break;
        default:
            
    }
	}

}
