import java.sql.*;

class FetchRecord
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","system","system123");

		DatabaseMetaData dbmd=con.getMetaData();

		System.out.println("driver name "+dbmd.getDriverName());
		
		System.out.println("driver version "+dbmd.getDriverVersion());
		
		System.out.println("user name "+dbmd.getUserName());
		
		System.out.println("database product name "+dbmd.getDatabaseProductName());
		
		System.out.println("database product version "+dbmd.getDatabaseProductVersion());
		
		String table[]={"VIEW"};		

		ResultSet rs=dbmd.getTables(null,null,null,table);

		while(rs.next())
		{
			System.out.println(rs.getString(3));
		}
		
		
		con.close();
	}
}