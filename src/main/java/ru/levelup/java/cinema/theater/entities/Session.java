package ru.levelup.java.cinema.theater.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import

public class Session {

    private Hall hall;
    private Date startTime;
    private double price;
    private List<Ticket> tickets; // equals private List<Tickets> tickets = null;

    public Session(Hall hall, Date startTime) {
        this.hall = hall;
        this.startTime = startTime;
    }

    public Session(Hall hall, Date startTime, double price) {
        this.hall = hall;
        this.startTime = startTime;
        this.price = price;
        this.tickets = new ArrayList<>();
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(List<Ticket> boughtTickets) {
        int availablePlaces = getAmountOfAvailablePlaces();
        if (availablePlaces < boughtTickets.size()) {
            System.out.println("");
            throw new IllegalArgumentException("");
        }

        if (Objects.isNull(tickets)) {
            tickets = new ArrayList<>();
        }

        tickets.addAll(boughtTickets);
    }

    public int getAmountOfAvailablePlaces() {
        return hall.getAmountOfPlace() - tickets.size();
    }
}