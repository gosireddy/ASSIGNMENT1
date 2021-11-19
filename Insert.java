import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Insert {

	public void Insert() throws Exception {

		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String usn="system";
		String pwd="system";
		DriverManager.registerDriver(new OracleDriver());
	    Connection con=DriverManager.getConnection(url, usn,pwd);
	    String query="INSERT INTO STUDENT VALUES(?,?,?,?)";
	    PreparedStatement pstat=con.prepareStatement(query);
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println("enter name");
	    String name=s.nextLine();
	    System.out.println("enter dob");
	    String dob=s.nextLine();
	    System.out.println("enter doj");
	    String doj=s.nextLine();
	    System.out.println("enter id");
	    int id=s.nextInt();
	    pstat.setInt(1, id);
	    pstat.setString(2, name);
	    pstat.setString(3, dob);
	    pstat.setString(4, doj);
	    int z=pstat.executeUpdate();
	}
}
