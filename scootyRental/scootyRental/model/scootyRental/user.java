package scootyRental;

public class user extends address {

	public String firstName;
	public String lastName;
	public String email;
	public String phoneNo;
	public address address;
	
	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public address getAddress() {
		return address;
	}


	public void setAddress(address address) {
		this.address = address;
	}


	public user() {
		// TODO Auto-generated constructor stub
	}

}
