package gun4Odev2.entities;



public class Customer {
     int id;
     String firstName;
     String lastName;
     int dateOFBirth;
     String nationalityId;
     
     
	public Customer(int id, String firstName, String lastName, int dateOFBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOFBirth = dateOFBirth;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOFBirth() {
		return dateOFBirth;
	}


	public void setDateOFBirth(int dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
    
    
}