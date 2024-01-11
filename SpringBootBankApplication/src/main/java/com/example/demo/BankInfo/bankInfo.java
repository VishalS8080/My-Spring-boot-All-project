package com.example.demo.BankInfo;

public class bankInfo {

	private int id;
	
	private String bname;
	
	private String Address;
	
	private int IFSCcode;
	
	private int MICRcode;
	
	 private int ContactNo;
	 
	 private String EmailId;
	 
	 private int FaxNo;
	 
	 private int Pincode;
	 
	 private int RegistrationNo;
	 
	 private String Branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getIFSCcode() {
		return IFSCcode;
	}

	public void setIFSCcode(int iFSCcode) {
		IFSCcode = iFSCcode;
	}

	public int getMICRcode() {
		return MICRcode;
	}

	public void setMICRcode(int mICRcode) {
		MICRcode = mICRcode;
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

	public int getFaxNo() {
		return FaxNo;
	}

	public void setFaxNo(int faxNo) {
		FaxNo = faxNo;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public int getRegistrationNo() {
		return RegistrationNo;
	}

	public void setRegistrationNo(int registrationNo) {
		RegistrationNo = registrationNo;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	@Override
	public String toString() {
		return "bankInfo [id=" + id + ", bname=" + bname + ", Address=" + Address + ", IFSCcode=" + IFSCcode
				+ ", MICRcode=" + MICRcode + ", ContactNo=" + ContactNo + ", EmailId=" + EmailId + ", FaxNo=" + FaxNo
				+ ", Pincode=" + Pincode + ", RegistrationNo=" + RegistrationNo + ", Branch=" + Branch + "]";
	}
	 
	 
	 
	
}
