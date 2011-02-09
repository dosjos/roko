package rodekors.registrering.model;


import java.util.Collection;
import java.util.Set;

import rodekors.registrering.api.model.Model;
import rodekors.registrering.gui.MainGUI;
import rodekors.registrering.service.DataBaseHandler;
import rodekors.registrering.service.FileHandler;
import rodekors.registrering.service.Ungdom;


//
public class MainComunicator implements Model{

	private boolean dbEnabled;
	private DataBaseHandler dh;
	private FileHandler fh;
	private MainGUI mg;
	
	public void startUp() {
		chooseDbOrFile();
//	       javax.swing.SwingUtilities.invokeLater(new Runnable() {
//	            public void run() {
//	                MainGUI.createAndShowGUI(this);
//	            }
//	        });
	    
		mg = new MainGUI();
		mg.createAndShowGUI(this);
	}

	public Object[] getAllKids() {
		Object kids[] = null;
		if(dbEnabled){
			Set c = (Set) dh.getAllKids();
			//kids = new String[c.size()];
			System.out.println(c.size());
			
			kids = c.toArray();
			System.out.println(kids[0]);
			System.out.println(kids.length);
			return kids;
		}else{
			//TODO Fil handling 
		}
		return kids;
	}

	/**
	 * Check and sees if the database is up and running
	 * If not, it enables filewriting.
	 */
	private void chooseDbOrFile() {
		dh = new DataBaseHandler();
		if(dh.hasConnection() == true){
			dbEnabled = true;
		}else{
			dh = null;
			dbEnabled = false;
			fh = new FileHandler();
		}
	}

	public void turnOf() {
		// TODO Auto-generated method stub
		if(dbEnabled){
			dh.closeConnection();
		}else{
			
		}
		
		System.exit(0);
	}

	public boolean registerKid(String fName, String lName, String snr,
			String place, String postNr, String gender, String adress,
			String mail, String tlf) {
		
		Ungdom u = new Ungdom(fName, lName, snr, place,  postNr, gender, adress, mail, tlf);
		
		if(dbEnabled){
			dh.newkid(u);
		}else{
			
		}
		return true;
	}
	
	
	

	

}
