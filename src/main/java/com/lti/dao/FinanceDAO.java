package com.lti.dao;

import java.util.List;

import com.lti.entity.Book_Product;
import com.lti.entity.Customer_details;
import com.lti.entity.Product_available_for_Emi;
import com.lti.entity.cardDetails;
import com.lti.entity.orderDetails;



public interface FinanceDAO 
{
	public boolean addCustomer(Customer_details customer);
	public List<Customer_details> getCustomer();
	public boolean validateLogin(String email_id,String password);
	public boolean validateAdminLogin(String logid,String pass);
	public boolean addProduct(Product_available_for_Emi product);
	public List<Product_available_for_Emi> getProduct();
	

	
	public boolean bookProduct(Book_Product buyproduct);
	public List<Book_Product> getbookProduct();
	
	public boolean deleteProduct(String id);
	
	public List<cardDetails> searchcard(String email);
	public boolean addcard(cardDetails card);
	public List<cardDetails> getcarddetails();
	
	public boolean addorder(orderDetails order);
	public List<orderDetails> getorderdetails(String email);
	
	public cardDetails findProfile(String Email_id);
	public boolean updatecustomer(cardDetails customer);
	
	
	
}
