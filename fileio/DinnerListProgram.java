package fileio;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DinnerListProgram {

    public static String askForEntiree(){
        Scanner keyboard = new Scanner(System.in);
        int guestCounterCounter = ++;
        String guestTracker = "Guest " + guestCounter;
        System.out.println("Enter one entiree out of these three: 1.Chicken. 2.Beef. 3.Vegetarin");
        String entiree = keyboard.nextLine();
        EntireeSheet entireeSheet = new EntireeSheet(guest, entiree);
        return entiree;
    }
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String entiree = askForEntiree();
        while(!entiree.equalsIgnoreCase("chicken")){
            list.add(entiree);
            entiree = askForEntiree();
        }

        while(!entiree.equalsIgnoreCase("beef")){
            list.add(entiree);
            entiree = askForEntiree();
        }

        while(!entiree.equalsIgnoreCase("vegetarin")){
            list.add(entiree);
            entiree = askForEntiree();
        }
        try {
            PrintWriter fileOutput = new PrintWriter(new BufferedWriter(new FileWriter("entiree.txt", true)));



        }
        catch(IOException ex) {
            System.out.println(ex);
        }

        File file = new File("entireelist.txt");
        if(file.exists()){
            try{
                BufferedReader inputFile = new BufferedReader(new FileReader(file));

                String line = inputFile.readLine();
                while(line != null){
                    String[] parts = line.split(":");
                    String numberofguest = parts[0];
                    String choiceofentiree = parts[1];
                    EntireeSheet entireeSheet = new EntireeSheet()
                    System.out.println(parts);
                    line = inputFile.readLine();
                }

                inputFile.close();

            }
            catch(IOException ex){
                System.out.println(ex);
            }

            for (String itemName : list) {
                System.out.println(itemName);
            }

        }
    }
}
