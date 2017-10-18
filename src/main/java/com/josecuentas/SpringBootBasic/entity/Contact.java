package com.josecuentas.SpringBootBasic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String firstName;
	public String lastName;
	public String address;
	public String phoneNumber;
	public String email;
	public String twitterHandle;
	public String facebookProfile;
	public String linkedInProfile;
	public String googlePlusProfile;
}
