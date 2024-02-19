package org.example;

import java.time.LocalDateTime;

public class Ticket {
    private int rootNumber;
    private int price;
    private LocalDateTime dataStart;
    private LocalDateTime dataEnd;
    private int place;
    private boolean isValid;

    public void setRootNumber(int rootNumber) {
        this.rootNumber = rootNumber;
    }

    public void setDataStart(LocalDateTime dataStart) {
        this.dataStart = dataStart;
    }

    public LocalDateTime getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(LocalDateTime dataEnd) {
        this.dataEnd = dataEnd;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Ticket(int rootNumber, int price, LocalDateTime dataStart, LocalDateTime dataEnd, int place) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.place = place;
        this.isValid = true;
    }

    public Ticket() {

    }

    public int getRootNumber() {
        return rootNumber;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getDataStart() {
        return dataStart;
    }
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", price=" + price +
                ", dataStart=" + dataStart +
                ", dataEnd=" + dataEnd +
                ", place=" + place +
                ", isValid=" + isValid +
                '}';
    }
}
