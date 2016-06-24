package by.epamlab;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

import by.epamlab.beans.Customer;



@Path("customer")
public class Service {

	@Context
	private ServletContext context; 
	private Data data = new Data();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Customer> getCustomers() {
		
		List<Customer> customers = data.getData();
		return customers;
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomer(@PathParam("id") int id){
			
		Customer customer = data.findCustomerById(id);
		return customer;		
	}
	

	@DELETE
	@Path("{id}")
	public void removeCustomer(@PathParam("id") int id){
		
		data.deleteCustomerById(id);

	
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void addCustomer(JAXBElement<Customer> customer){
		data.addCustomer(customer.getValue());
	
	}
	

	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void updateCustomer(JAXBElement<Customer> customer) {
		
		data.updateCustomer(customer.getValue());
	}

}