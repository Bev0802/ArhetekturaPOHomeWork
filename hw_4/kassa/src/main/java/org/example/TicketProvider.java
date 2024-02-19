package org.example;

import java.util.ArrayList;

public class TicketProvider {
    public ArrayList<Ticket> getTickets(int rootNumber, Ticket[] tickets) {
        ArrayList<Ticket> foundTickets = new ArrayList<Ticket>();
        for (Ticket ticket : tickets) {
            if (ticket.getRootNumber() == rootNumber) {
                foundTickets.add(ticket);
            }
        }
        return foundTickets;
    }

    public boolean updateTicketStatus(Ticket ticket) {
        // Implementation for updating ticket status
        if (ticket.getPrice() > 0) {
            ticket.setPrice(0);
            return true;
        } else {
            return false;
        }
    }
}
