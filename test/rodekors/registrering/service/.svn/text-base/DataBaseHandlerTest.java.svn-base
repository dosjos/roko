package rodekors.registrering.service;

import java.sql.Connection;
import java.sql.DriverManager;

import junit.framework.TestCase;

public class DataBaseHandlerTest extends TestCase {

	public void testDatabaseConnection() throws Exception {
	
		       Class.forName("org.h2.Driver");
		        Connection conn = DriverManager.getConnection("jdbc:h2:~/PersonLog", "sa", "");
		       // conn.createStatement().execute("Create table balls(ID int primary key, Navn varchar(100))");
		        //Funker som faen
		        conn.close();
	}

} 	
