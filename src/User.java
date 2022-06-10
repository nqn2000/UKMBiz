
public class User {
	private String Username;
	private String Password;
	private int PhoneNumber;
	private String Email;
	private String Address;
	
	public void User(String username, String password, int phoneNum, String email, String address) {
		Username = username;
		Password = password;
		PhoneNumber = phoneNum;
		Email = email;
		Address = address;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}
