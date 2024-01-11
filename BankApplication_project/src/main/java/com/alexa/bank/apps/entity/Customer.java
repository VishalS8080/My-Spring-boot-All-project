package com.alexa.bank.apps.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private long contactNo;
	private String gender;
	private String dateOfBirth;
	private String emailId;
	private String adharCard;
	private String panCard;
	private String identificationMark;
	private String address;
	private String occupation;
	private String uname;
	private String password;
	
	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name = "c_r_id")
	private List<Role> role =new ArrayList<Role>();

}
