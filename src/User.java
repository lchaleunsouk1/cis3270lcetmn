import java.util.ArrayList;

/*
 * Created by: Leena Chaleunsouk
 * On: 12/03/16
 */
public class User {
	String userName; // should be unique
	String email; // should be unique
	String password;
	String fName;
	String lName;
	String ssn; // needs to be 9 digits; use isDigit
	String address;
	String zip;
	String state; // two letters; maybe do array so it could be a drop down
					// list.
	String secQuestion; // drop down list; five possible choices
	String secAnswer; // remember to ignore case
	public static boolean isAdmin = false;

	// int count = 0; // increment userID ** not needed

	/* ** not needed because gui will interact with getter and setter methods
	 * public User(String userName, String email, String password, String
	 * userAnswer, String fName, String lName, String ssn, String address,
	 * String zip, String state, int seqQuestion, String seqAnswer) {
	 * this.userID = incrementUserID(); this.userName = userName; this.email =
	 * email; this.password = password; this.userAnswer = userAnswer;
	 * this.userType = whatUser(this.userAnswer); this.fName = fName; this.lName
	 * = lName; this.ssn = ssn; this.address = address; this.zip = zip;
	 * this.state = state; this.seqQuestion = seqQuestion; this.seqAnswer =
	 * seqAnswer; }
	 */
	public User() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSecQuestion() {
		return secQuestion;
	}

	public void setSeqQuestion(String secQuestion) {
		this.secQuestion = secQuestion;
	}

	public String getSecAnswer() {
		return secAnswer;
	}

	public void setSecAnswer(String secAnswer) {
		this.secAnswer = secAnswer;
	}

	@Override
	public String toString() {
		return "User\nUsername:\t" + userName + "\nEmail:\t\t" + email + "\nPassword:\t" + password 
				+ "\nUser Type:\t" + userType + "\nFirst Name:\t" + fName + "\nLast Name:\t" + lName 
				+ "\nSSN:\t\t" + ssn + "\nAddress:\t" + address + "\nZip:\t\t" + zip
				+ "\nState:\t\t" + state + "\nSecurityQuestion: " + secQuestion 
				+ "\nSecurity Answer: " + secAnswer + "\n";
	}
	
	/* **unnecessary
	 * public void setCount(int count) { this.count = incrementUserID(); }
	 *

	public boolean whatUser(String input) {
		if (input.equalsIgnoreCase(adminPassword)) {
			return true;
		} else {
			return false;
		}
	}

	public int incrementUserID() {
		count++;
		this.userID += count;
		return this.userID;
	}
*/

}
