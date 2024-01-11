package com.example.demo.accountopn;

public class AccountOpening {
	
    private int id;
	
    private String Name;
    
    private String AccountType;
    
    private int AccountNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	@Override
	public String toString() {
		return "AccountOpening [id=" + id + ", Name=" + Name + ", AccountType=" + AccountType + ", AccountNo="
				+ AccountNo + "]";
	}
    
	

}
