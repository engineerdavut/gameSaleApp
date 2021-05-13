package com.company;
import java.util.Date;

public class Game {
    private int id;
    private String name;
    private String description;
    private double price;
    private Date broadcastingDate;

    public Game(int id, String name, String description, double price, Date broadcastingDate) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.broadcastingDate=broadcastingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBroadcastingDate() {
        return broadcastingDate;
    }

    public void setBroadcastingDate(Date broadcastingDate) {
        this.broadcastingDate = broadcastingDate;
    }
}
