package fileio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryOrder {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        try{
            PrintWriter fileOutput = new PrintWriter( new BufferedWriter( new FileWriter("list.txt")));


            System.out.println("What is the name of the restaurant you are ordering from?");
            String restaurantName = scnr.nextLine();
            fileOutput.write("Resturant Name: " + restaurantName);

            int itemCounter = 1;

            while(itemCounter <=3){
                System.out.println("Enter the name of item " + itemCounter + ":");
                String itemName = scnr.nextLine();
                System.out.println("Item : " + itemCounter + ":" + itemName);

                System.out.println("Enter the price of item " + itemName + ":");
                double itemPrice = scnr.nextDouble();
                System.out.println("Item : " + itemCounter + ":" + itemName);

                itemCounter++;

            }
        }
        catch(IOException ex){
            System.out.println(ex);
        }

    }

}
