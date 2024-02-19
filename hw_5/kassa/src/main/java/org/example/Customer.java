package org.example;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Ticket> tickets;
    private CashProvider cashProvider;

    public Customer(int id, CashProvider cashProvider, TicketProvider ticketProvider) {
        this.id = id;
        this.tickets = new ArrayList<>();
        this.cashProvider = cashProvider;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cashProvider.buy(ticket.getPrice())) {
            tickets.add(ticket);
            return true;
        }
        return false;
    }

    public boolean repealTicket(Ticket ticket) {
        if (tickets.remove(ticket)) {
            cashProvider.repealTicket(ticket.getPrice());
            return true;
        }
        return false;
    }

    public List<Ticket> searchTicket(int rootNumber) {
        List<Ticket> result = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getRootNumber() == rootNumber) {
                result.add(ticket);
            }
        }
        return result;
    }

    public int getId() {
        return id;
    }

    public void setCashProvider(CashProvider cashProvider) {
        this.cashProvider = cashProvider;
    }
}