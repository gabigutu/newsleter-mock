package com.newsletter;

public class Subscriber {

    private int id;

    public Subscriber(int id) {
        this.id = id;
    }

    public void receiveMessage(String message) {
        System.out.println("Subscribed " + this.id + " received the following message: " + message);
    }

}
