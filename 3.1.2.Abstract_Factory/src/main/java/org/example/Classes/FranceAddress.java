package org.example.Classes;

import org.example.Interfaces.InternationalAddress;

public class FranceAddress implements InternationalAddress {

    private final String address;

    public FranceAddress(String address) {
        this.address = address;
    }

    @Override
    public String getIAddress() {
        return "France address: " + address;
    }

    @Override
    public String toString(){
        return getIAddress();
    }
}
