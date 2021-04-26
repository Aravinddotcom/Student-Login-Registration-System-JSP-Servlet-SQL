import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;


public class RegisterDao {
private String dburl="jdbc:mysql://localhost:3306/userdb";
private String dbuname="root";
private String dbpassword="1234";
private String dbdriver="com.mysql.jdbc.Driver";
public void loadDriver(String dbDriver)
{
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public Connection getConnection()
{
	Connection con=null;
try {
	con=DriverManager.getConnection(dburl, dbuname, dbpassword);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
return con;
}
public String insert(Member member){
	loadDriver(dbdriver); 
	Connection con=getConnection();
	System.out.println("connection is "+con);
	String result= "Data entered successfully";
	String sql="INSERT INTO userdb.member" + "(uname, password, email, phone, rollno, dob, gender, course) VALUES" + " (?,?,?,?,?,?,?,?);";
	try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, member.getUname());
		ps.setString(2, member.getPassword());
		ps.setString(3, member.getEmail());
		ps.setString(4, member.getPhone());
		ps.setString(5, member.getRollno());
		ps.setString(6, member.getDob());
		ps.setString(7, member.getGender());
		ps.setString(8, member.getCourse());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result="Data not entered";
	}
	
	return result;
	
}

}

