

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class doctorreg
 */
@WebServlet("/doctorreg")
public class doctorreg extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String a=request.getParameter("n1");
	String b=request.getParameter("n2");
	String c=request.getParameter("n3");
	String d=request.getParameter("n4");
	String e=request.getParameter("n5");
	String f=request.getParameter("n6");
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare","root","");
		Statement st=con.createStatement();
		st.executeUpdate("insert into doctor values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"')");
	    response.sendRedirect("dregister.jsp");
		
		
				
	}
	catch(Exception a1)
	{
		System.out.println(a1);
	}
	
	}

}
