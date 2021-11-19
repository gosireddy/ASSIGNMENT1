import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Delete {
	public void Delete() throws Exception
	{
		DriverManager.registerDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String pwd="system";
		String usd="system";
		Connection con=DriverManager.getConnection(url, usd, pwd);
		String query="DELETE FROM STUDENT WHERE ID=?";
		PreparedStatement pstat=con.prepareStatement(query);
		Scanner s=new Scanner(System.in);
		System.out.println("enter id");
		int id=s.nextInt();
		pstat.setInt(1, id);
		int z=pstat.executeUpdate();
	}

}
