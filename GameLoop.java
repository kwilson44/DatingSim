import java.util.Scanner;
import java.util.ArrayList;
//import House.java;

public class GameLoop {
    ArrayList<String> inventory = new ArrayList<String>();     
    ArrayList<String> characterization = new ArrayList<String>();  
    int gamePoints = 0;

  
    public static void main(String[] args) {

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("********************************");
        System.out.println("SMITH COLLEGE DATING SIMULATOR");
        System.out.println("********************************");

        // Instructions are sometimes helpful
        System.out.println("Enter WIN to win, LOSE to lose, anything else to continue playing.");

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓

              // Use a PlayerIntro to execute character creation, taking in information for
              // the user's name, class year, and so on.
            PlayerIntro characterCreation = new PlayerIntro();
            characterCreation.GamerMethod();

              // Execute the beginning of the game by calling the House Intro, starting the player
              // at the initial location of their House.
            House playerHouse = new House();
            playerHouse.HouseIntro(0);
            
            System.out.println("You are still playing. Follow the instructions to continue.");
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("WIN") || userResponse.equals("LOSE")) {
                stillPlaying = false;
            }
        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("GAME OVER. Better luck next time.");
        }

    }

}