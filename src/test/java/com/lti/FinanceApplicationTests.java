/*package com.lti;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dao.FinanceDAO;
import com.lti.entity.Book_Product;
import com.lti.entity.Customer_details;
import com.lti.entity.Product_available_for_Emi;
import com.lti.entity.orderDetails;

@SpringBootTest
@Transactional
class FinanceApplicationTests {
@Autowired
FinanceDAO fdao;

	
	@Test
	void testaddProduct() {
		Product_available_for_Emi prod=new Product_available_for_Emi("p001","brandnamed","category","name","details","image","model",200);
		boolean res=fdao.addProduct(prod);
		assertEquals(true,res);
	}
	
	
//	@Test
//	
//	void testaddorder() {
//
//		orderDetails order=new orderDetails(500,"123","email","type","id","prodname","cost","emicost","emimonth");
//		boolean res=fdao.addorder(order);
//		assertEquals(true,res);
//	}
//	
//	void deleteProduct() {
//		Product_available_for_Emi obj=new Product_available_for_Emi(1);
//		boolean res=fdao.deleteProduct(obj);
//		assertEquals(true,res);
//	}
	
}
*/
