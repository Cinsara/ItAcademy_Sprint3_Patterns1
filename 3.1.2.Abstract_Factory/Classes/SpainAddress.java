package org.example.Classes;

import org.example.Interfaces.InternationalAddress;

public class SpainAddress implements InternationalAddress {

    private final String address;

    public SpainAddress(String address) {
        this.address = address;
    }

    @Override
    public String getIAddress() {
        return "Spain address: " + address;
    }

    @Override
    public String toString(){
        return getIAddress();
    }
}
