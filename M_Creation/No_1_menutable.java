package M_Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class No_1_menutable {
	public void TableCreate() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"mysys","1234");
			PreparedStatement stmt = (PreparedStatement) con.createStatement();
			System.out.println("Connection Success");
			
			String mtc="create table TiffinItems (items varchar(20),cost int)";
			stmt.executeUpdate(mtc);
			
			System.out.println("Menu Table Created /-TiffinItems (Items varchar(20),cost int)/- is successfull");
			stmt.close();
			con.close();		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
