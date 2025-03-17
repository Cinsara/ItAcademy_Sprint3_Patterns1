package org.example.Controller;

import org.example.Classes.Agenda;
import org.example.Classes.AgendaFrance;
import org.example.Classes.AgendaItaly;
import org.example.Classes.AgendaSpain;
import org.example.Interfaces.AgendaAF;

public class Controller {
    public static void start(){

        AgendaAF[] agFactories = {new AgendaItaly(), new AgendaFrance(), new AgendaSpain()};
        Agenda[] agCountry = new Agenda[3];
        String[] numbers = {"987654345","789098765","645789123"};
        String[] address = {"C/Menestra 78","C/Lalala 56","C/Susana 67"};

        for(int i = 0; i < agFactories.length; i++){
            agCountry[i] = new Agenda(agFactories[i]);
            agCountry[i].addContact(numbers[i],address[i]);
        }
    }
}
