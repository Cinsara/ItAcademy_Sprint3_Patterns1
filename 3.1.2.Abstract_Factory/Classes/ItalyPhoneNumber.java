package org.example.Classes;

import org.example.Interfaces.InternationalPhoneNumber;

public class ItalyPhoneNumber implements InternationalPhoneNumber {

    private final String phoneNumber;

    public ItalyPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getIPhoneNumber() {
        return "+39" + phoneNumber;
    }

    @Override
    public String toString(){
        return getIPhoneNumber();
    }
}
