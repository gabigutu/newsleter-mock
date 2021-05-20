package com.newsletter;

import java.util.ArrayList;
import java.util.List;

public class Newsletter {

    // tina subscriberii
    private List<Subscriber> subscribers;

    // Design Pattern: Observer
    // entitate principala (clasa Newsletter), la care se "leaga" mai multe obiecte astfel incat obiectele
    // respective sa "observe" anumite schimbari
    // entitatea prinicpala poate sa-i notifice pe cei "legati" la el de anumite lucruri/modificari

    public Newsletter() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void broadcast(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveMessage(message);
        }
    }

    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        int i;
        for (i = 0; i < 10; i++) {
            Subscriber subscriber = new Subscriber(i);
            newsletter.addSubscriber(subscriber);
        }

        newsletter.broadcast("Salut, ce faceti?");

        newsletter.addSubscriber(new Subscriber(i));
        newsletter.broadcast("Inca un mesaj ca sa-l cuprindem si pe cel nou");

    }
}
