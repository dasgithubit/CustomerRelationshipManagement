package com.CustomerRelationshipManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.Entity.Customer;
import com.CustomerRelationshipManagement.Service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/insert")
	public Customer insert(@RequestBody Customer customer) {
		
		return customerService.insert(customer);
	}
	
	

}
