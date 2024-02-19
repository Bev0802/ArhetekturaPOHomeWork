package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Kassa {
    public static void main(String[] args) {
        // Создание экземпляров классов Ticket и CashProvider
        Ticket ticket1 = new Ticket(1, 100, LocalDateTime.now(), LocalDateTime.now(), 1);
        CashProvider cashProvider1 = new CashProvider(1234567890123456L, true);

        // Создание экземпляра класса TicketProvider
        TicketProvider ticketProvider = new TicketProvider();

        // Создание экземпляра класса Customer
        Customer customer = new Customer(1, cashProvider1, ticketProvider);

        // Покупка билета
        boolean isBought = customer.buyTicket(ticket1);
        System.out.println("Билет куплен: " + isBought);

        // Возврат билета
        boolean isReturned = customer.repealTicket(ticket1);
        System.out.println("Билет возвращен: " + isReturned);

        // Поиск билета по корневому номеру
        Ticket[] foundTickets = customer.searchTicket(1).toArray(new Ticket[0]);
        System.out.println("Найденные билеты:");
        for (Ticket ticket : foundTickets){
            System.out.println(ticket); }

        // Обновление статуса билета
        boolean isStatusUpdated = ticketProvider.updateTicketStatus(ticket1);
        System.out.println("Статус билета обновлен: " + isStatusUpdated);
    }
}