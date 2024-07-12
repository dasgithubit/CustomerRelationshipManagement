package com.CustomerRelationshipManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.Entity.SupportTicket;
import com.CustomerRelationshipManagement.Service.SupportTicketService;

@RestController
@RequestMapping("/api/tickets")
public class SupportTicketController {
	
	
	@Autowired
    private SupportTicketService supportTicketService;

    @GetMapping
    public List<SupportTicket> getAllTickets() {
        return supportTicketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public SupportTicket getTicketById(@PathVariable Long id) {
        return supportTicketService.getTicketById(id);
    }

    @PostMapping
    public SupportTicket createTicket(@RequestBody SupportTicket supportTicket) {
        return supportTicketService.saveTicket(supportTicket);
    }

    @PutMapping("/{id}")
    public SupportTicket updateTicket(@PathVariable Long id, @RequestBody SupportTicket supportTicket) {
        supportTicket.setId(id);
        return supportTicketService.saveTicket(supportTicket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        supportTicketService.deleteTicket(id);
    }

}
