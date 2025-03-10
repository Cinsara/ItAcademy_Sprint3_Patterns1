package org.example.Classes;

import org.example.Interfaces.InternationalAddress;

public class ItalyAddress implements InternationalAddress {

    private final String address;

    public ItalyAddress(String address) {
        this.address = address;
    }

    @Override
    public String getIAddress() {
        return "Italy Address: " + address;
    }

    @Override
    public String toString(){
        return getIAddress();
    }
}
