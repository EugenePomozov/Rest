package by.epamlab.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private int id;
	
	private String customerDocID;
	private String firstName;
	private String lastName;
	private int sequence;
	
	private Email email;
	private Phone phone;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String customerDocID, String firstName, String lastName, int sequence, Email email,
			Phone phone) {
		super();
		this.id = id;
		this.customerDocID = customerDocID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sequence = sequence;
		this.email = email;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerDocID() {
		return customerDocID;
	}
	public void setCustomerDocID(String customerDocID) {
		this.customerDocID = customerDocID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}



}
