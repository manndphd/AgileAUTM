package junitcucumber;
public class User {
	private String lastName;
	private String firstName;
	private String Email;
	private String userName;
	private String passWord;
	private int Age;
	public User(String lastName, String firstName, String email, String userName, String passWord, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.Email = email;
		this.userName = userName;
		this.passWord = passWord;
		this.Age = age;
	}
	public User(){}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean checkAgeValid() {
		if (this.Age < 18) {
			return false;
		} else {
			return true;
		}
	}



}
