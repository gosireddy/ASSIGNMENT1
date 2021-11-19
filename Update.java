import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Update {
	
	public void Update() throws Exception {
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String usn="system";
		String pwd="system";
		DriverManager.registerDriver(new OracleDriver());
		Connection con=DriverManager.getConnection(url, usn, pwd);
		String query="UPDATE STUDENT SET DOJ=? WHERE ID=?";
		PreparedStatement pstat=con.prepareStatement(query);
		Scanner s=new Scanner(System.in);
		System.out.println("enter doj");
		String doj=s.nextLine();
		System.out.println("enter id");
		int id=s.nextInt();
		pstat.setString(1, doj);
		pstat.setInt(2, id);
		int z=pstat.executeUpdate();
	}

}
