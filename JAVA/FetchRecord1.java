import java.sql.*;

class FetchRecord1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","system","system123");

		Statement stmt=con.createStatement();

		PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(110,'rahul2',25000)");
		pstmt.addBatch();
		pstmt=con.prepareStatement("insert into emp1 values(111,'rahul3',25000)");
		pstmt.addBatch();

		/*stmt.addBatch("insert into emp1 values(107,'rahul',25000)");	
		stmt.addBatch("insert into emp1 values(108,'rohal',25000)");
		stmt.addBatch("insert into emp1 values(109,'ketki',25000)");*/

		pstmt.executeBatch();

		ResultSet rs=stmt.executeQuery("select * from emp1");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		

		con.close();
	}
}

		
		