package org.example.Classes;

import org.example.Interfaces.InternationalPhoneNumber;

public class SpainPhoneNumber implements InternationalPhoneNumber {

    private final String phoneNumber;

    public SpainPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getIPhoneNumber() {
        return "+34" + phoneNumber;
    }

    @Override
    public String toString(){
        return getIPhoneNumber();
    }
}
