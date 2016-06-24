

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import by.epamlab.Customer;
import by.epamlab.Email;
import by.epamlab.Phone;

public class Runner {

	public Runner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getURI());
		GenericType<List<Customer>> genericType = new GenericType<List<Customer>>() {
		};
		List<Customer> customers = service.path("web").path("customer").accept(MediaType.APPLICATION_XML).get(genericType);

		for (Customer customer : customers) {
			System.out.println(customer.getCustomerDocID());
		}
		

		int id = 1;
		Customer customer = service.path("web").path("customer").path(String.valueOf(id)).accept(MediaType.APPLICATION_XML).get(Customer.class);
		System.out.println("Customer with id = " + id);
		System.out.println(customer.getCustomerDocID());

		System.out.println("Update customer");
		customer.setCustomerDocID("New Id");
		service.path("web").path("customer").post(customer);	
		
		
		
		customer = service.path("web").path("customer").path(String.valueOf(id)).accept(MediaType.APPLICATION_XML).get(Customer.class);
		System.out.println("Customer with id = " + id);
		System.out.println(customer.getCustomerDocID());


		System.out.println("delete customer by id  = " + id);
		service.path("web").path("customer").path(String.valueOf(id)).delete();
		customers = service.path("web").path("customer").accept(MediaType.APPLICATION_XML).get(genericType);

		
		for (Customer cus : customers) {
			System.out.println(cus.getCustomerDocID());
		}


		System.out.println("Add new customer");

		customer = new Customer(4,"New customer id=4","Igor","kirov",6
							,new Email("igor@gmail.com"),new Phone("222-33-44"));

		service.path("web").path("customer").accept(MediaType.APPLICATION_XHTML_XML).put(customer);

		
		
		
		customers = service.path("web").path("customer")
				.accept(MediaType.APPLICATION_XML).get(genericType);

		for (Customer cus : customers) {
			System.out.println(cus.getCustomerDocID()+" - "+cus.getEmail().getEmailAddress()+" - "+cus.getPhone().getPhoneNumber());
		}
	}
	
	
	private static URI getURI() {
		return UriBuilder.fromUri("http://localhost:8080/Rest").build();
	}
}