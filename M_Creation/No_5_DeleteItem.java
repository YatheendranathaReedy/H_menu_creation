package M_Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class No_5_DeleteItem {
	public void delit() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"mysys","1234");
			PreparedStatement stmt = (PreparedStatement) con.createStatement();
			System.out.println("Connection Success");
			System.out.println("Enter item name to delete from the menu list ");
			Scanner s=new Scanner(System.in);
			String Name_Of_Item=s.next();
			String del="Delete from TiffinItems where Items='"+Name_Of_Item+"'";
			stmt.executeUpdate(del);
			System.out.println("Deletion of item "+Name_Of_Item+" is successfull");
			stmt.close();
			con.close();		
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
}
