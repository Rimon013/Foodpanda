package com.austproject.foodpanda.model;

import java.util.jar.Attributes.Name;

public class Contact {
	 int _id;
	 String _name;
	 String _email;
	 String _password;
	 
	 public Contact()
	 {
		 
	 }
	 public Contact(int Id,String Name ,String ContactNumber,String password)
	 {
		 
		 this._id=Id;
		 this._name=Name;
		 this._email=ContactNumber;
		 this._password = password;
		 
	 }
	 
	 public Contact(String Name,String ContactNumber,String password)
	 {
		 this._name=Name;
		 this._email=ContactNumber;
		 this._password = password;
			 
	 }
	 
	 public int getId()
	 {
		 return this._id;
	 }
	 public void setId(int Id)
	 {
		 this._id=Id;
	 }
	 
	 public String getName()
	 {
		return this._name;
	 }
	 public void setName(String Name)
	 {
		 this._name=Name;
	 }
	 
	 public String getContactNumber()
	 {
		return this._email;
	 }
	 public void setContactNumber(String ContactNumber)
	 {
		 this._email=ContactNumber;
	 }

	public String getPassword()
	{
		return this._password;
	}
	public void setpassword(String pass)
	{
		this._password=pass;
	}


	
	

}
