import java.util.Scanner;
public class LunarLander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int distanceFromSurface = 10;
        int xAxisTilt = (int) ((Math.random() * 20) - 10);
        int yAxisTilt = (int) ((Math.random() * 20) - 10);


        while (true) {
            System.out.println("Distance From the Surface is " + distanceFromSurface);
            System.out.println("The x axis tilt is " + xAxisTilt);
            System.out.println("The y axis tilt is " + yAxisTilt);
            System.out.println("Commands that can be sent is: Change x or y axis, Thuster, Do Nothing, or Self-Destruct.");
            String commands = scnr.nextLine();

            switch (commands) {
                case "x":
                    System.out.println("Enter direction for x axis: -1 or 1");
                    xAxisTilt += Integer.parseInt(scnr.nextLine());
                    break;
                case "y":
                    System.out.println("Enter direction for y axis: -1 or 1");
                    yAxisTilt += Integer.parseInt(scnr.nextLine());
                    break;
                case "thuster":
                    distanceFromSurface += 2;
                    break;
                case "do nothing":
                    break;
                case "self-destruct":
                    System.out.println("Enter the six-digit cancellation code: ");
                    String inputCode = scnr.nextLine();
                    int userCode = Integer.parseInt(inputCode);
                    int cancelCode = 123456;
                    if (cancelCode == userCode) {
                        break;
                    } else {
                        System.out.println("Invalid cancel code. Lunar Lander self-destructing...");
                    }
                    break;
                default:
                    System.out.println("Invalid command. Commands that can be sent is: Change x or y axis, Thuster, Do Nothing, or Self-Destruct.");
            }
                if (xAxisTilt != 0 && yAxisTilt != 0) {
                    System.out.println("Lunar Lander Crashed. Game Over :(");
                } else {
                    System.out.println("Lunar Lander Landed Successfully. :)");
                }
            System.out.println("Do You Want Again?");
            String ans = scnr.nextLine();
            }

        }
}
