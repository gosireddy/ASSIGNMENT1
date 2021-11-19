import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Pfetch {

	public void Pfetch() throws Exception
	{
		DriverManager.registerDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String pwd="system";
		String usd="system";
		Connection con=DriverManager.getConnection(url, usd, pwd);
		Statement stat=null;
		String query="SELECT * FROM STUDENT WHERE ID=?";
		PreparedStatement pstat=con.prepareStatement(query);
		Scanner s=new Scanner(System.in);
		System.out.println("enter id");
		int id =s.nextInt();
		pstat.setInt(1, id);
		ResultSet res = pstat.executeQuery();
		while(res.next()==true)
		{
			int id1=res.getInt(1);
			String name=res.getString(2);
			String dob=res.getString(3);
			String doj=res.getString(4);
			System.out.println(id1+" "+name+" "+dob+" "+doj);
		}
	}
}
