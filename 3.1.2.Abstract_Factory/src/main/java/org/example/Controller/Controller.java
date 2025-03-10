package org.example.Controller;

import org.example.Classes.Agenda;
import org.example.Classes.AgendaFrance;
import org.example.Classes.AgendaItaly;
import org.example.Classes.AgendaSpain;
import org.example.Interfaces.AgendaAF;

public class Controller {
    public static void start(){

//        AgendaAF factorySpain = new AgendaSpain();
//        Agenda agendaSpain = new Agenda(factorySpain);
//        agendaSpain.addContact("645789123", "C/Susana 67");
//
//        AgendaAF factoryItaly = new AgendaItaly();
//        Agenda agendaItaly = new Agenda(factoryItaly);
//        agendaItaly.addContact("987654345", "C/Menestra 78");
//
//        AgendaAF factoryFrance = new AgendaFrance();
//        Agenda agendaFrance = new Agenda(factoryFrance);
//        agendaFrance.addContact("789098765", "C/Lalala 56");
//
//        System.out.println("\n------\n");

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
