package ru.levelup.java.cinema.theater.entities;



import java.util.List;

public class Client {

    private String name;
    private List<Ticket> ticket;

    public Client(String name, List<Ticket> ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }
}