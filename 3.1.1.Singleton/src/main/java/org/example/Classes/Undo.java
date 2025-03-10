package org.example.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undo {
    private static Undo instance;
    Scanner input = new Scanner(System.in);
    private List<String> orders;

    Undo(){
        this.orders = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instance == null) {
            instance = new Undo();
        }
        return  instance;
    }

    public void addNewOrder(){
        String order;
        System.out.println("You're adding a new order, please introduce the order's name:");
        order = input.nextLine();

        if(orders.contains(order)){
            System.out.println("The order has not been added. It already exists.");
        } else{
            orders.add(order);
            System.out.println("New order added.");
        }
    }

    public void removeOrders(){
        String order;
        System.out.println("You're removing an order, please introduce the order's name:");
        order = input.nextLine();

        if(orders.contains(order)){
            System.out.println("The order has been removed.");
            orders.remove(order);
        } else{
            System.out.println("The order has not been removed. It not exists.");
        }

    }

    public void listOrders(){
        System.out.println("The order list is: ");

        if(orders.isEmpty()){
            System.out.println("There is not orders to list.");
        } else {
            int count = Math.max(orders.size() -5,0);
            List<String> lastOrders = orders.subList(count,orders.size());

            for(String order : lastOrders){
                System.out.println(order);
            }
        }
    }
}
