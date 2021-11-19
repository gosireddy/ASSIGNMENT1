import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Fetch {

	public void Fetch() throws Exception
	{
		DriverManager.registerDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String pwd="system";
		String usd="system";
		Connection con=DriverManager.getConnection(url, usd, pwd);
		String query="SELECT * FROM STUDENT";
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery(query);
		while(res.next()==true)
		{
			int id=res.getInt(1);
			String name=res.getString(2);
			String dob=res.getString(3);
			String doj=res.getString(4);
			System.out.println(id+" "+name+" "+dob+" "+doj);
		}
	}
}
