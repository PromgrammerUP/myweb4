package org.javachina.myweb4.view;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page2
 */
@WebServlet("/page2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//servletContext中存在一个map
		//ServletContext可以被全局（整个应用）共享
		ServletContext context = this.getServletContext();
		Integer i = (Integer)context.getAttribute("count");
		if(i==null){
					context.setAttribute("count", 1);
					
		   }else{
					context.setAttribute("count", i+1);
				}
				response.getWriter().println(context.getAttribute("count"));
	}

	

}
