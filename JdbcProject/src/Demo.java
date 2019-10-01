import java.sql.*;
public class Demo
{
  public static void main(String[] args) throws Exception
  {
	Class.forName("com.mysql.jdbcDriver");
	
	Connection connection=null;
	Statement statement=null;
	connection=DriverManager.getConnection("URL","UN","PW");
	statement=connection.createStatement();
	 
	ResultSet rs=statement.executeQuery("select * from student");
	
	while(rs.next()) 
	{
		System.out.println(rs.getInt(0)+" "+rs.getString(0));
		
	}
	statement.close();
	connection.close();
	
	
	
}
}
