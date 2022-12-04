package M_Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class No_3_UpdateItem {
	public void upit() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"mysys","1234");
			PreparedStatement pstmt = con.prepareStatement("insert into TiffinItems values(?,?)");
			System.out.println("Connection Success");
			Scanner scan=new Scanner(System.in);
			String p,Item,Done="next";
			int cost;
			
	        while(Done=="next")   
	        {
	        	System.out.println("Enter Item name");
	        	Item=scan.next();
	        	System.out.println(Item+"Enter the cost for the item");
	        	cost=scan.nextInt();
	        	pstmt.setString(1,Item);
	        	pstmt.setInt(2, cost);
	        	System.out.print("if you want to enter extra items please enter next otherwise press any key to exit");
	        	Done=scan.next();
	        	int rs=pstmt.executeUpdate();	
	        }
	        
	        System.out.println("Successfully updated the items");
	        pstmt.close();
	        con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
