import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.initialLibrary();
        Scanner scan = new Scanner(System.in);
        boolean GO = true;
        // A loop that endlessly goes through asking the user what they want to do with the library
        while(GO) {
            System.out.println("Welcome! What would you like to do? \n 1: Play \n 2: Display contents \n 3. Add \n 4: Remove \n 5: Sort Alphabetically \n 6: Skip \n 7: Shuffle \n 8: Find an Item \n 9: Exit");
            int userInput = scan.nextInt();
            if (userInput == 1) {
                library.play();
            }
            else if (userInput == 2) {
                System.out.println("These are the contents of library:");
                library.display();
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
                library.sort();
            }
            else if (userInput == 6) {
                library.skip();
            }
            else if (userInput == 7) {
                library.shuffle();
            }
            else if (userInput == 8) {
                scan = new Scanner(System.in);
                System.out.println("What do you wanna look for?");
                String find = scan.nextLine();
                if (library.find(find) == -1) {
                    System.out.println("Not found in library");
                }
                else {
                    System.out.println(find + " is located at number " + library.find(find));
                }
            }
            else if (userInput == 9) {
                GO = false;
            }
            else {
                System.out.println("Error: Incorrect input, please try again.");
            }
        }
    }
}