package org.example.Classes;

import java.util.Scanner;

public class Controller {
    public static void start(){

        Scanner input = new Scanner(System.in);
        int option;
        Undo undo = new Undo();

        do {
            System.out.println("Select an option for use the undo command:" +
                    "\n 1. Add an order." +
                    "\n 2. Remove an order." +
                    "\n 3. List all the latest orders added.");
            option = input.nextInt();

            switch(option){
                case 1:
                    undo.addNewOrder();
                    break;

                case 2:
                    undo.removeOrders();
                    break;

                case 3:
                    undo.listOrders();
                    break;

                case 0:
                    System.out.println("Bye!");
                    break;
            }

        } while(option != 0);
        input.close();
    }
}
