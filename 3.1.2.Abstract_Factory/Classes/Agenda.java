package org.example.Classes;

import org.example.Interfaces.AgendaAF;
import org.example.Interfaces.InternationalAddress;
import org.example.Interfaces.InternationalPhoneNumber;

public class Agenda {
    private AgendaAF factory;

    public Agenda(AgendaAF factory){
        this.factory = factory;
    }

    public void addContact(String number, String address){
        InternationalPhoneNumber phoneNumber = factory.createInternationalPhoneNumber(number);
        InternationalAddress intAddress = factory.createInternationalAddress(address);

        System.out.println("New contact added: " + phoneNumber + " | " + intAddress);
    }
}
