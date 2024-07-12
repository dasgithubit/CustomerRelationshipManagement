package com.CustomerRelationshipManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.Entity.SupportTicket;
import com.CustomerRelationshipManagement.Repository.SupportTicketRepository;

@Service
public class SupportTicketService {
	
	
	@Autowired
    private SupportTicketRepository supportTicketRepository;

    public List<SupportTicket> getAllTickets() {
        return supportTicketRepository.findAll();
    }

    public SupportTicket getTicketById(Long id) {
        return supportTicketRepository.findById(id).orElse(null);
    }

    public SupportTicket saveTicket(SupportTicket supportTicket) {
        return supportTicketRepository.save(supportTicket);
    }

    public void deleteTicket(Long id) {
        supportTicketRepository.deleteById(id);
    }
	
	

}
