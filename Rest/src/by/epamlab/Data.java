package by.epamlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import by.epamlab.beans.Customer;
import by.epamlab.beans.Email;
import by.epamlab.beans.Phone;

public class Data {
	private static List<Customer> data;
	private static int newIndex=5;
	static {
		data = new ArrayList<Customer>();
		data.add(new Customer(1,"1","Andrey","Ivanov",1,new Email("fghfgfgh@gmail.com"),new Phone("123-45-67")));
		data.add(new Customer(2,"33","Sergey","Petrov",1,new Email("hgjghhj@mail.ru"),new Phone("345-54-44")));
		data.add(new Customer(3,"5","Pavel","Sidorov",1,new Email("fgh.fgh@tut.by"),new Phone("678-99-00")));

	}
	
	public  List<Customer> getData() {
		return data;
	}
	
	public  Customer findCustomerById(long id) {
		for (Customer customer : data) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}
	
	
	public  boolean addCustomer(Customer customer) {
		customer.setId(newIndex);
		newIndex++;
		return data.add(customer);
	}
	
	public  boolean deleteCustomerById(int id) {
		boolean result = false;		
		Iterator<Customer> iter=data.iterator();
		while(iter.hasNext()){
			if(iter.next().getId()==id){
				iter.remove();
				result=true;
			}
		}
		return result;
	}
	
	public  boolean updateCustomer(Customer customer) {
		boolean result = false;
		for (Customer temp: data) {
			if (temp.getId() == customer.getId()) {
				temp.setEmail(customer.getEmail());
				temp.setPhone(customer.getPhone());
				result = true;
			}
		}
		return result;
	}
}
