package com.CustomerRelationshipManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.Entity.Customer;
import com.CustomerRelationshipManagement.Repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer insert(Customer customer) {
		
		return customerRepository.save(customer);
		
	}

}
