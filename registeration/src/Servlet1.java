

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String rollno=request.getParameter("rollno");
		out.print("<h1>Exam Hallticket</h1>");
		out.print("<table  width=40% border='1'>");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false", "root", "root");
			Statement stmt=con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM userdb.member where rollno ="+rollno+"");
			
			//ResultSetMetaData rsmd=rs.getMetaData();
			while (rs.next()) 
			{
				
				  out.print("<tr>");

               out.print("<tr><td><b>Name</b></td>");

                     out.print("<td>"+rs.getString(1)+"</td></tr>");

                     out.print("<tr><td><b>Register number</b></td>");
                     out.print("<td>"+rs.getString(5)+"</td></tr>");
                     
                     out.print("<tr><td><b>Date of Birth</b></td>");
                     out.print("<td>"+rs.getString(6)+"</td></tr>");
             
                     out.print("<tr><td><b>Gender</b></td>");
                     out.print("<td>"+rs.getString(7)+"</td></tr>");
                     
                     out.print("<tr><td><b>Course</b></td>");
                     out.print("<td>"+rs.getString(8)+"</td></tr>");
                     
                     out.print("<tr><td><b>Phone number</b></td>");

                     out.print("<td>"+rs.getString(4)+"</td></tr>"); 

                   out.print("<tr><td><b>Email ID</b></td>");

                     out.print("<td>"+rs.getString(3)+"</td></tr>");

                  
                     
                    
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		out.print("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
