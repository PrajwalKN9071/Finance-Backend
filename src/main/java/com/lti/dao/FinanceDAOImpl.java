package com.lti.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.AdminLogin;
import com.lti.entity.Book_Product;
import com.lti.entity.Customer_details;

import com.lti.entity.Product_available_for_Emi;
import com.lti.entity.cardDetails;
import com.lti.entity.orderDetails;
@Repository
public class FinanceDAOImpl implements FinanceDAO {

	@Autowired
	EntityManager eMan;

	@Override
	public boolean addCustomer(Customer_details customer) {
		
		eMan.persist(customer);	
		return true;
	}

	@Override
	public List<Customer_details> getCustomer() 
	{
		return eMan.createQuery("from Customer_details").getResultList();

	}

	@Override
	public boolean validateLogin(String email_id, String password) {
		Query qry2=eMan.createQuery("from Customer_details log where log.Email_id =?1 and log.Password=?2");
		qry2.setParameter(1,email_id);
		qry2.setParameter(2,password);		

		List<Customer_details> users=qry2.getResultList();		
		if(users.size()>0)
			return true;
		else
			return false;
	}
	@Override
	public boolean validateAdminLogin(String logid, String pass) {
		Query qry1=eMan.createQuery("from AdminLogin logs where logs.loginid =?1 and logs.password=?2");
		qry1.setParameter(1,logid);
		qry1.setParameter(2,pass);		

		List<AdminLogin> user=qry1.getResultList();		
		if(user.size()>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean addProduct(Product_available_for_Emi product) {
		eMan.persist(product);
		return true;
	}

	@Override
	public List<Product_available_for_Emi> getProduct() {

		return eMan.createQuery("from Product_available_for_Emi").getResultList();
	}

	

	@Override
	public boolean bookProduct(Book_Product buyproduct) {
		eMan.persist( buyproduct);
		return true;
	}

	@Override
	public List<Book_Product> getbookProduct() {

		return eMan.createQuery("from Book_Product").getResultList();

	}

	@Override
	public boolean deleteProduct(String id) {
		Product_available_for_Emi obj=eMan.find(Product_available_for_Emi.class,id);
		eMan.remove(obj);
		return true;
	}

	@Override
	public List<cardDetails> searchcard(String email) {
		Query qry1=eMan.createQuery("from cardDetails logs where logs.email =?1");
		qry1.setParameter(1,email);
		List<cardDetails> user=qry1.getResultList();
		return user;		

	}

	@Override
	public boolean addcard(cardDetails card) {
		eMan.persist(card);

		return true;
	}

	@Override
	public List<cardDetails> getcarddetails() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from cardDetails").getResultList();
	}

	@Override
	public boolean addorder(orderDetails order) {

		eMan.persist(order);	
//		System.out.println("Product buy succesfully");
		return true;
	}

	@Override
	public List<orderDetails> getorderdetails(String email) {
		Query qry1=eMan.createQuery("from orderDetails logs where logs.email=?1");
		qry1.setParameter(1,email);
		List<orderDetails> order=qry1.getResultList();
		return order;
		
	}

	@Override
	public cardDetails findProfile(String Email_id) {
		
				cardDetails obj=eMan.find(cardDetails.class, Email_id);
				return obj;
	}
	@Override
	public boolean updatecustomer(cardDetails customer) {
		eMan.merge(customer);
		return true;
	}


}
