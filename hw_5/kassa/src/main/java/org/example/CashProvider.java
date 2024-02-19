package org.example;

public class CashProvider { private long card; private boolean isAuthorization;

    public CashProvider(long card, boolean isAuthorization)
    { this.card = card; this.isAuthorization = isAuthorization; }

    public boolean buy(int price) { if (price > 0 && isAuthorization)
    { System.out.println("Куплен билет на сумму: " + price); return true; } else { System.out.println("Ошибка покупки билета."); return false; } }

    public boolean repealTicket(int price)
    { if (price > 0 && isAuthorization) { System.out.println("Возвращен билет на сумму: " + price); return true; } else { System.out.println("Ошибка возврата билета."); return false; } }

    public boolean authorization(Customer customer)
    { if (customer != null) { isAuthorization = true; System.out.println("Авторизация пройдена."); return true; } else { System.out.println("Ошибка авторизации."); return false; } } }

