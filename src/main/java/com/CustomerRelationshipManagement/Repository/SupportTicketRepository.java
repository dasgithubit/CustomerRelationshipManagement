package com.CustomerRelationshipManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerRelationshipManagement.Entity.SupportTicket;

public interface SupportTicketRepository extends JpaRepository<SupportTicket, Long> {

}
