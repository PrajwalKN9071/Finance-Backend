package com.lti.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.dao.FinanceDAO;
import com.lti.entity.Book_Product;
import com.lti.entity.Customer_details;
import com.lti.entity.Product_available_for_Emi;
import com.lti.entity.cardDetails;
import com.lti.entity.orderDetails;
@Service
@Transactional
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	FinanceDAO fdao;
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addCustomer(Customer_details customer) {
		
		return fdao.addCustomer(customer);
	}

	@Override
	public List<Customer_details> getCustomer() {
		
		return fdao.getCustomer();
	}

	
	@Override
	public boolean validateLogin(String email_id, String password) {
		
		return fdao.validateLogin(email_id, password);
	}
	@Override
	public boolean validateAdminLogin(String logid, String pass) {
		
		return fdao.validateAdminLogin(logid, pass);
	}

	@Override
	public boolean addProduct(Product_available_for_Emi product) {
		
		return fdao.addProduct(product);
	}

	@Override
	public List<Product_available_for_Emi> getProduct() {
	
		return fdao.getProduct();
	}

	

	@Override
	public boolean bookProduct(Book_Product buyproduct) {	
		return fdao.bookProduct(buyproduct);
	}

	@Override
	public List<Book_Product> getbookProduct() {
		
		return fdao.getbookProduct();
	}

	@Override
	public boolean deleteProduct(String id) {
		
		return fdao.deleteProduct(id);
	}

	@Override
	public List<cardDetails> searchcard(String email) {
	
		return fdao.searchcard(email);
	}

	@Override
	public boolean addcard(cardDetails card) {
		
		return fdao.addcard(card);
	}

	@Override
	public List<cardDetails> getcarddetails() {
		
		return fdao.getcarddetails();
	}

	@Override
	public boolean addorder(orderDetails order) {
		System.out.println(order.getEmail());

	System.out.println(order.getProdname());
		return fdao.addorder(order);
	}

	@Override
	public List<orderDetails> getorderdetails(String email) {
	
		return fdao.getorderdetails(email);
	}

	@Override
	public cardDetails findProfile(String Email_id) {
		// TODO Auto-generated method stub
				return fdao.findProfile(Email_id);
	}

	@Override
	public boolean updatecustomer(cardDetails customer) {
		// TODO Auto-generated method stub
		return fdao.updatecustomer(customer);
	}
	
	
}
