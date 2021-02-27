
public class customer {
	
	String accountID;
	String name;
	String address;
	String dateOfBirth;
	
	public customer() {
		// TODO Auto-generated constructor stub
	}

	public customer(String accountID, String name, String address, String dateOfBirth) {
		super();
		this.accountID = accountID;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
}
