package com.kodilla.good.patterns.allegro;

public class MailService implements InformationService {

    public void inform(User user) {

        System.out.println("The order was successful for the user:" + user.getName());
    }
}

