package com.bridgelabz.addressBook;
public class Person
{
	private String firstName;
	private String lastName;
	private Address address;
	private long contact;
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getFname() {
		return firstName;
	}
	public void setFname(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setLname(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", contact=" +contact +"address="
				+ address + "]";
	}
}
