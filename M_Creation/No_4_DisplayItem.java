package M_Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class No_4_DisplayItem {
	public void di() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"mysys","1234");
			Statement stmt = con.createStatement();
			System.out.println("Connection Success");
			String p="select * from TiffinItems";
			ResultSet rs=stmt.executeQuery(p);
			System.out.println();
			ResultSetMetaData rsmt=rs.getMetaData();
			System.out.println(rsmt.getColumnName(1)+"		"+rsmt.getColumnName(2));
			System.out.println();
	        while(rs.next())   
	        {
	            System.out.print(rs.getString(1)+"		");
	            System.out.print(rs.getString(2));
	            System.out.println();
	        }
	        stmt.close();
	        con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
