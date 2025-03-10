package org.example.Classes;

import org.example.Interfaces.AgendaAF;
import org.example.Interfaces.InternationalAddress;
import org.example.Interfaces.InternationalPhoneNumber;

public class AgendaFrance implements AgendaAF {
    @Override
    public InternationalAddress createInternationalAddress(String address) {
        return new ItalyAddress(address);
    }

    @Override
    public InternationalPhoneNumber createInternationalPhoneNumber(String phoneNumber) {
        return new ItalyPhoneNumber(phoneNumber);
    }
}
