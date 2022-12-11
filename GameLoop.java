import java.util.Scanner;
import java.util.ArrayList;
//import House.java;

public class GameLoop {
    ArrayList<String> inventory = new ArrayList<String>();     
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
              String [] gardenNeighborhood = {"COMSTOCK HOUSE", "HAVEN/WESLEY", "GARDINER HOUSE", "MORROW HOUSE", "SESSIONS COMPLEX", "WILDER HOUSE", "WILSON HOUSE"};
        String [] ivyNeighborhood = {"ALBRIGHT HOUSE","BALDWIN HOUSE","CHAPIN HOUSE",
                                     "DUCKETT HOUSE","HUBBARD HOUSE","LAWRENCE HOUSE","MORRIS HOUSE","TYLER HOUSE",
                                     "WASHBURN HOUSE"
                                    };
        String [] mountainNeighborhood = {"CAPEN HOUSE",
                                          "CUTTER HOUSE","GILLETT HOUSE","LAMONT HOUSE","NORTHROP HOUSE",
                                          "TALBOT HOUSE","ZISKIND HOUSE"
                                         };
        String [] paradiseNeighborhood = {"CUSHING HOUSE",
                                          "EMERSON HOUSE","FRIEDMAN APARTMENTS","JORDAN HOUSE","KING HOUSE","PARK HOUSE","PARSONS HOUSE","SCALES HOUSE"
                                         };
        String [] specialInterestHousing = {"CHASE HOUSE","HOPKINS HOUSE",
                                            "PARK ANNEX","PARSONS ANNEX","TENNEY HOUSE"
                                           };
      
        final Scanner myObj = new Scanner(System.in);

        System.out.println("Hi! my name Sophia Smith and I'm going to help you find love... or confess to your crush. What's your name?");
        final String InputName = myObj.nextLine();

        System.out.println("Well, it's nice to meet you " + InputName + "! Let's begin. What neighborhood do you wanna live in? Enter 'A' for Garden Neighborhood, 'B' for Ivy Neighborhood, 'C' for Mountain Neighborhood, 'D' for Paradise Neighborhood and 'E' for Special Interest Housing: ");
        String userInputNeighborhood = myObj.nextLine();

        if(userInputNeighborhood.equals("A")) {
            double index = (int)(Math.random()*(((gardenNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
           String playerHouse = gardenNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);


        } else if (userInputNeighborhood.equals("B")) {
            double index = (int)(Math.random()*(((ivyNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
           String playerHouse = ivyNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);


        } else if (userInputNeighborhood.equals("C")) {
            double index = (int)(Math.random()*(((mountainNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            String playerHouse = mountainNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);


        } else if (userInputNeighborhood.equals("D")) {
            double index = (int)(Math.random()*(((paradiseNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            String playerHouse = paradiseNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);

        } else if(userInputNeighborhood.equals("E")) {
            double index = (int)(Math.random()*(((specialInterestHousing.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            String playerHouse = specialInterestHousing[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);

        } else {
            System.out.println("That wasn't an option... You know what? You had your chance, we're putting you in Sessions, have fun with the ghosts.");
         String playerHouse = "SESSIONS HOUSE";

        }        

      System.out.println("Now, what's your class year?");
      int userInputClassYear = myObj.nextInt();
      

      if (userInputClassYear == 2026 || userInputClassYear == 2025 || userInputClassYear== 2024 || userInputClassYear == 2023) {

        //characterization.add(userInputClassYear);
        } else {
        System.out.println("Try again! *hint* *hint* 2026,2025,2024,2023");
        userInputClassYear = myObj.nextInt();

            Player currentUser = new Player(InputName, userInputClassYear, playerHouse);

              // Execute the beginning of the game by calling the House Intro, starting the player
              // at the initial location of their House.
            House userHouse = new House();
            userHouse.HouseIntro(0);
            
            System.out.println("You are still playing. Follow the instructions to continue.");
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("WIN") || userResponse.equals("LOSE")) {
                stillPlaying = false;
            } while (stillPlaying); {

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
        }
  
      