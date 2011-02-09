package rodekors.registrering.service;

import java.awt.List;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import rodekors.registrering.api.service.Service;

public class DataBaseHandler implements Service {
	
	private Class a;
	private Connection conn;
	private Statement stmt;
	
	
	public DataBaseHandler(){
		try {
			a = Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/PersonLog", "sa", "");
		} catch (Exception e) {
			//something happened, and we wont use the database in this session
			//boot up the filehandler and do everything from there nao;
			e.printStackTrace();
		} 
	}
	
	public boolean hasConnection() {
		if(conn == null){
			return false;
		}
		return true;
	}
	
	public void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			//if it cant close, then fuck it. It closes sometime anyway
			e.printStackTrace();
		}
	}
	

	public File createNewLogDay() {
		// TODO Auto-generated method stub
		return null;
	}


	public Set<String> getAllKids() {
		Set<String> c = null;
		String sql = "select firstname || ' ' || lastname from kids; ";
		ResultSet r;
		try{
			c = new HashSet();
			stmt = conn.createStatement();
			r = stmt.executeQuery(sql);
			String s;
			while(r.next()){
				s = r.getString(1);
				c.add(s);
			}
			
			return c;
		}catch(SQLException e){
			return null;
		}
	}


	public boolean newkid(Ungdom u) {
		String create = "create table if not exists KIDS " +
				"(firstname varchar, " +
				"lastname varchar, " +
				"gender varchar, " +
				"ssnumber varchar, " +
				"postcode int, " +
				"place varchar, " +
				"adress varchar, " +
				"email varchar,  " +
				"tlf varchar)";
		String sql = "INSERT INTO KIDS (FIRSTNAME, LASTNAME, GENDER, SSNUMBER, POSTCODE, PLACE, ADRESS, EMAIL, TLF) " +
				"VALUES ('"+ u.getFirstName() + "','" + u.getLastName()+ "','" + u.getGender() + "','" + u.getSSNumber() + "','" +
				u.getPostCode()+ "','" +u.getPlace()+ "','" +u.getAdress()+ "','" +u.getEmail()+ "','" +u.getTlf()+"');";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(create);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//Noe gikk galt, implementer en skjekk for om databasen har gått ned,
			//evt prøv igjen eller skriv til fil
			e.printStackTrace();
			return false;
		}
		return true;
	}


	public Collection readLog() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateKid(Ungdom u) {
		// TODO Auto-generated method stub

	}


	public void updateLog(String log) {
		// TODO Auto-generated method stub

	}

	public void registerKid(String fName, String lName, String snr,
			String place, String postNr, String gender, String adress,
			String mail, String tlf) {
		// TODO Auto-generated method stub
		
	}

}
