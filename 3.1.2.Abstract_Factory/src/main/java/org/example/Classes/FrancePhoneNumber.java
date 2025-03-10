package org.example.Classes;

import org.example.Interfaces.InternationalPhoneNumber;

public class FrancePhoneNumber implements InternationalPhoneNumber {

    private final String phoneNumber;

    public FrancePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getIPhoneNumber() {
        return "+33" + phoneNumber;
    }

    @Override
    public String toString(){
        return getIPhoneNumber();
    }
}
