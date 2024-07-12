package com.CustomerRelationshipManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerRelationshipManagement.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
