import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answerToTryAgain;
        do{
        System.out.println("Choose between Paper, Rock, Scissors, Spock, or Lizard.");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("paper") && !answer.equalsIgnoreCase("rock") &&
                !answer.equalsIgnoreCase("scissors") && !answer.equalsIgnoreCase("spock") &&
                !answer.equalsIgnoreCase("lizard")) {
            System.out.println("Choose between Paper, Rock, Scissors, Spock, or Lizard.");
            answer = scanner.nextLine();
        }
        int randnum = (int) (Math.random() * 5) + 1;
        if (answer.equalsIgnoreCase("paper")) {
            randnum = (int) (Math.random() * 5) + 1;
            System.out.println(randnum);
        } else if (answer.equalsIgnoreCase("rock")) {
            randnum = (int) (Math.random() * 5) + 1;
            System.out.println(randnum);
        } else if (answer.equalsIgnoreCase("scissors")) {
            randnum = (int) (Math.random() * 5) + 1;
            System.out.println(randnum);
        } else if (answer.equalsIgnoreCase("spock")) {
            randnum = (int) (Math.random() * 5) + 1;
            System.out.println(randnum);
        } else if (answer.equalsIgnoreCase("lizard")) {
            randnum = (int) (Math.random() * 5) + 1;
            System.out.println(randnum);
        }
        int randNumberTwo = (int) (Math.random() * 5) + 1;
        if (randNumberTwo == randnum) {
            System.out.println("Draw!");
        } else if (randNumberTwo - 1 == randnum) {
            System.out.println("Lose!");
        } else
            System.out.println("Win!");
        System.out.println("Do You Want Play Again?");
         answerToTryAgain = scanner.nextLine();
        }while(answerToTryAgain.equals("yes"));
    }
}