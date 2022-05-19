package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Book_Product;
import com.lti.entity.Customer_details;
import com.lti.entity.Product_available_for_Emi;
import com.lti.entity.cardDetails;
import com.lti.entity.orderDetails;
import com.lti.service.FinanceService;
import com.lti.service.FinanceServiceImpl;

@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200")
public class FinanceController {
	
	@Autowired
	FinanceService fService;
	
	@GetMapping("/customer")
	public List<Customer_details> getCustomer()
	{
		return fService.getCustomer();
	}
	
	@PostMapping("/customer")
	public boolean addCustomer(@RequestBody Customer_details customer)
	{
		//customer.setAccountstatus("Pending");
		return fService.addCustomer(customer);
	}
	@GetMapping("/validatelogin/{email_id}/{password}") // Passing multiple arguments with url
	public boolean validateLogin(@PathVariable("email_id") String email_id,@PathVariable("password") String password)
	{
			return fService.validateLogin(email_id, password);
	}
	@GetMapping("/validateAdminlogin/{logid}/{passwd}") // Passing multiple arguments with url
	public boolean validateAdminLogin(@PathVariable("logid") String id,@PathVariable("passwd") String pass)
	{
			return fService.validateAdminLogin(id, pass);
	}
	@GetMapping("/product")
	public List<Product_available_for_Emi> getProduct()
	{
		return fService.getProduct();
	}
	
	@PostMapping("/product")
	public boolean addProduct(@RequestBody Product_available_for_Emi product)
	{
		return fService.addProduct(product);
	}
	
	@PostMapping("/bookingproduct")
	public boolean bookProduct(@RequestBody Book_Product buyproduct)
	{
		return fService.bookProduct(buyproduct);
	}
	@GetMapping("/bookingproduct")
	public List<Book_Product> getbookProduct()
	{
		return fService.getbookProduct();
	}
	@DeleteMapping("/deleteproduct/{id}") //For deleting
	public boolean deleteProduct(@PathVariable("id") String  id)
	{
		  return fService.deleteProduct(id);
	}
	@PostMapping("/carddetails")
	public boolean addcard(@RequestBody cardDetails card)
	{
		card.setCardStatus("Pending");
		card.setJoiningFeeStatus("Pending");
		return fService.addcard(card);
	}

	@GetMapping("/carddetails")
	public List<cardDetails> getcarddetails()
	{
		return fService.getcarddetails();
	}
	
	@GetMapping("/carddetails/{email}")
	public List<cardDetails> searchcard(@PathVariable("email") String email){
		
		return fService.searchcard(email);
		
	}
	@PostMapping("/order")
	public boolean addorder(@RequestBody orderDetails order)
	{
		System.out.println("controller");
		return fService.addorder(order);
	}
	@GetMapping("/order/{email}")
	public List<orderDetails> getorderdetails(@PathVariable("email") String email){
		return fService.getorderdetails(email);	
	}
	
//	@GetMapping("/vcustomer/{email_id}") 
//	public cardDetails findProfile(@PathVariable("email_id") String Email_id)
//	{
//			return fService.findProfile(Email_id);
//	}
//	@PutMapping("/updatecustomer") //For Updating 
//	public boolean updatecustomer(@RequestBody cardDetails customer)
//	{
//		System.out.println("controller");
//		return fService.updatecustomer(customer);
//	}
	@GetMapping("/vcustomer/{email_id}") // Passing Argumet with URL and Fiding the Object
	public cardDetails findProfile(@PathVariable("email_id") String email_id)
	{
			return fService.findProfile(email_id);
	}
	@PutMapping("/updatecustomer") //For Updating 
	public boolean  updatecustomer(@RequestBody cardDetails customer)
	{
		return fService. updatecustomer(customer);
	}
	
}
