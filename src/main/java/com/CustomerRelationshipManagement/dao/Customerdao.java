package com.CustomerRelationshipManagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CustomerRelationshipManagement.Entity.Customer;

@Repository
public class Customerdao {
	
	@Autowired
	SessionFactory s;
	
	public String insert(Customer customer) {
		
		Session session = s.openSession();
		Transaction transaction =  session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		
		return "Customer insert successfully";
		
		
		
		
		
	}

}
