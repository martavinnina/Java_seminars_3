package model.user;

import service.IPostService;

public abstract class RegisteredUser extends GuestUser implements IPostService{ //abstract - nevares izveidot objektu neparrakstot
	//1.variables
	private String username;
	protected String nameAndSurnameOrTitle;
	
	//TODO izmantot enkodesanu
	private String password;


	
	//2.get and set
	public String getUsername() {
		return username;
	}

	public void setUsername() {
		this.username = super.getUserID() + "_" + nameAndSurnameOrTitle.substring(0, 5).trim(); //dabu no mantotas klases
	}

	public String getNameAndSurnameOrTitle() {
		return nameAndSurnameOrTitle;
	}

	public abstract void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle); //katra bernu klases stradas savadak, jo ir user un uznemums

	
	//var nomainit pieejamibu no public uz citu
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//3.constructors
	public RegisteredUser() {
		super(); //izsauc public GuestUser()
		setPassword("1234567");
	}
	
	public RegisteredUser(String password) {
		super(); //izsauc public GuestUser()
		setPassword(password);
	}
	
	
	//4.toString
	public String toString() {
		return "Registered user ->" +super.toString() + ": " + nameAndSurnameOrTitle + "(" +username + ")";
	}
	
	
	
	//5.other functions
	//TODO login and follow page
	
}
