package com.CustomerRelationshipManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerRelationshipManagement.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
