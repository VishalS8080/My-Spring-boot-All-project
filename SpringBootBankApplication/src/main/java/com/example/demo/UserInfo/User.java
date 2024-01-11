package com.example.demo.UserInfo;

public class User {
	
	private int id;
	
    private String FirstName;
	
	private String FatherName;
	
	private String MotherName;
	
	private String LastName;
	
    private String Address;
    
    private int BirthDate;
    
    private int ContactNo;
    
    private String EmailId;
    
    private int AdharCard;
    
    private int Pancard;
    
    private String Username;
	
	private String pass;
	
	private String Gender;
	
	private String IndentificationMark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(int birthDate) {
		BirthDate = birthDate;
	}

	public int getContactNo() {
		return ContactNo;
	}

	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public int getAdharCard() {
		return AdharCard;
	}

	public void setAdharCard(int adharCard) {
		AdharCard = adharCard;
	}

	public int getPancard() {
		return Pancard;
	}

	public void setPancard(int pancard) {
		Pancard = pancard;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getIndentificationMark() {
		return IndentificationMark;
	}

	public void setIndentificationMark(String indentificationMark) {
		IndentificationMark = indentificationMark;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FirstName=" + FirstName + ", FatherName=" + FatherName + ", MotherName="
				+ MotherName + ", LastName=" + LastName + ", Address=" + Address + ", BirthDate=" + BirthDate
				+ ", ContactNo=" + ContactNo + ", EmailId=" + EmailId + ", AdharCard=" + AdharCard + ", Pancard="
				+ Pancard + ", Username=" + Username + ", pass=" + pass + ", Gender=" + Gender
				+ ", IndentificationMark=" + IndentificationMark + "]";
	}
	

}
