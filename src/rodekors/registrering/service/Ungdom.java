package rodekors.registrering.service;

import rodekors.registrering.api.service.Person;

public class Ungdom implements Person {
	/*MUST HAVE*/
	private String firstName;
	private String lastName;
	private String gender;
	private String SSNumber;
	private String postCode;
	private String Place;
	/* OPTIONAL*/
	private String adress;
	private String email;
	private String tlf;
	
	
	 
	public Ungdom(String fName, String lName, String snr, String place2,
			String postNr, String gender2, String adress2, String mail,
			String tlf2) {
		firstName = fName;
		lastName = lName;
		gender = gender2;
		SSNumber = snr;
		postCode = postNr;
		Place = place2;
		adress = adress2;
		email = mail;
		tlf = tlf2;
	}


	public String getAdress() {
		return adress;
	}

	 
	public String getEmail() {
		return email;
	}

	 
	public String getFirstName() {
		return firstName;
	}

	 
	public String getGender() {
		return gender;
	}

	 
	public String getLastName() {
		return lastName;
	}

	 
	public String getPlace() {
		return Place;
	}

	 
	public String getPostCode() {
		return postCode;
	}

	 
	public String getSSNumber() {
		return SSNumber;
	}

	 
	public String getTlf() {
		return tlf;
	}

	

	 
	public boolean equals(Object o){
		if(this.firstName.equalsIgnoreCase(((Person) o).getFirstName())){
			if(this.lastName.equalsIgnoreCase(((Person) o).getLastName())){
				if(this.SSNumber.equals(((Person) o).getSSNumber())){
					return true;
				}
			}
		}
		return false;
		
	}

	 
	public void setAdress(String adress) {
		this.adress = adress;
	}

	 
	public void setEmail(String email) {
		this.email = email;
	}

	 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	 
	public void setGender(String gender) {
		this.gender = gender;
	}

	 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	 
	public void setPlace(String Place) {
		this.Place = Place;
	}

	 
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	 
	public void setSSNumber(String SSNumber) {
		this.SSNumber = SSNumber;
	}

	 
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}



	
}
