import java.util.ArrayList;

/*
 * Created by: Leena Chaleunsouk
 * On: 12/03/16
 */
public abstract class User {
	String userName; // should be unique
	String email; // should be unique
	String password;
	String fName;
	String lName;
	String ssn; // needs to be 9 digits; use isDigit
	String address;
	String zip;
	String state; // two letters; maybe do array so it could be a drop down // list.
	String secQuestion; // drop down list; five possible choices
	String secAnswer; // remember to ignore case
	public static boolean isAdmin = false;

	public User() 
	{

	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 

		this.userName = userName;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getfName() 
	{
		return fName;
	}

	public void setfName(String fName) 
	{
		this.fName = fName;
	}

	public String getlName() 
	{
		return lName;
	}

	public void setlName(String lName) 
	{
		this.lName = lName;
	}

	public String getSSN() 
	{
		return ssn;
	}

	public void setSSN(String ssn) 
	{
		this.ssn = ssn;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getZip() 
	{
		return zip;
	}

	public void setZip(String zip) 
	{
		this.zip = zip;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getSecQuestion() 
	{
		return secQuestion;
	}

	public void setSeqQuestion(String secQuestion) 
	{
		this.secQuestion = secQuestion;
	}

	public String getSecAnswer() 
	{
		return secAnswer;
	}

	public void setSecAnswer(String secAnswer) 
	{
		this.secAnswer = secAnswer;
	}


}
