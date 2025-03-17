import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> library = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        // inventory.add("Jordan Breanna Arrington");
        boolean GO = true;
        while(GO) {
            System.out.println("Welcome! What would you like to do? \n 1: Play \n 2: Display contents \n 3. Add \n 4: Remove \n 5: Previous \n 6: Skip \n 7: Shuffle \n 8: Exit");
            int userInput = scan.nextInt();
            if (userInput == 1) {
                library.play();
            }
            else if (userInput == 2) {
                System.out.println("These are the contents of library:");
                System.out.println(library);
            }
            else if (userInput == 3) {
                System.out.println("What do you want to add to the library");
                scan = new Scanner(System.in);
                String addition = scan.nextLine();
                library.add(addition);
            }
            else if (userInput == 4) {
                System.out.println("What do you want to remove from the library");
                scan = new Scanner(System.in);
                String subtraction = scan.nextLine();
                library.remove(subtraction);
            }
            else if (userInput == 5) {
                library.previous();
            }
            else if (userInput == 6) {
                library.skip();
            }
            else if (userInput == 7) {
                library.shuffle();
                System.out.println("After Shuffling: " + library);
            }
            else if (userInput == 8) {
                GO = false;
            }
        }
    }
}