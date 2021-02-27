

public class User {

	String userID;
	String name;
	String phoneNum;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userID, String name, String phoneNum) {
		//super();
		this.userID = userID;
		this.name = name;
		this.phoneNum = phoneNum;
	}


	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
	
	
}
