import java.util.Scanner;
import java.util.ArrayList;
//import House.java;

public class GameLoop {
    ArrayList<String> inventory = new ArrayList<String>();     
    int gamePoints = 0;
  
    public static void main(String[] args) {

// from house.java
 //ArrayList<String> potentialDirections = new ArrayList<String>();
    Scanner myObj = new Scanner(System.in);
        //first n,e,s,w choice
        
        String directionInputOne = "";
        String directionInputTwo = "";
        //String directionInputThree = "";
        String startingPointInput = "";
        //Clarify with gamePoints




        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;
        String playerHouse ="";
        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("********************************");
        System.out.println("SMITH COLLEGE DATING SIMULATOR");
        System.out.println("********************************");

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
       // do { //COME BACK AND ADD DO WHILE KATIE AND ERIN KRIN
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
      

        System.out.println("Hi! my name Sophia Smith and I'm going to help you find love... or confess to your crush. What's your name?");
        final String InputName = myObj.nextLine();

        System.out.println("Well, it's nice to meet you " + InputName + "! Let's begin. What neighborhood do you wanna live in? Enter 'A' for Garden Neighborhood, 'B' for Ivy Neighborhood, 'C' for Mountain Neighborhood, 'D' for Paradise Neighborhood and 'E' for Special Interest Housing: ");
        String userInputNeighborhood = myObj.nextLine();

        if(userInputNeighborhood.equals("A")) {
            double index = (int)(Math.random()*(((gardenNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            playerHouse = gardenNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);


        } else if (userInputNeighborhood.equals("B")) {
            double index = (int)(Math.random()*(((ivyNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            playerHouse = ivyNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);


        } else if (userInputNeighborhood.equals("C")) {
            double index = (int)(Math.random()*(((mountainNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
             playerHouse = mountainNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);


        } else if (userInputNeighborhood.equals("D")) {
            double index = (int)(Math.random()*(((paradiseNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
             playerHouse = paradiseNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);

        } else if(userInputNeighborhood.equals("E")) {
            double index = (int)(Math.random()*(((specialInterestHousing.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
             playerHouse = specialInterestHousing[houseIndex];
            System.out.println("Great! Welcome to " + playerHouse);

        } else {
            System.out.println("That wasn't an option... You know what? You had your chance, we're putting you in Sessions, have fun with the ghosts.");
          playerHouse = "SESSIONS HOUSE";

        }        

      System.out.println("Now, what's your class year?");
      int userInputClassYear = myObj.nextInt();
      

      if (userInputClassYear == 2026 || userInputClassYear == 2025 || userInputClassYear== 2024 || userInputClassYear == 2023) {

        } else {
        System.out.println("Try again! *hint* *hint* 2026,2025,2024,2023");
        userInputClassYear = myObj.nextInt();
        }

        

            Player currentUser = new Player(InputName, userInputClassYear, playerHouse);
            House userHouse = new House();
              // Execute the beginning of the game by calling the House Intro, starting the player
              // at the initial location of their House.
              System.out.println(currentUser.name + " walks in to " + currentUser.userHouse + " 'Wowza!' You say in disbelief as you walk around and look at your potential home for the next 4 years. There's a wide array of Smithies buzzing and getting ready for classes. All of a sudden, a similar looking women appears: \n Hey, it's me, Sophia Smith again, I just wanted to tell you you can explore Smith's Campus by going N, E, S, W, there are limitations of course but you should look around, you could meet someone you fancy. You can also add things you find to your inventory by typing 'add' and the object you want. Also, you can impress your crush by talking with them or giving gifts you find. One last thing, while you can have multiple crushes, choosing one main one might make winning them over easier. One last thing, there is an element of time in this too. Choose your location wisely. Okay, good luck kid :D \n");

              

              System.out.println("With that, it's time for adventure... and love??? A bit overwhemled, you look at everything that beholds you. To the east (E) you can smell some ramen and hear a Smithie bitterly complaining about the food at Smith and further east the thudding of washing machines. To the west (W) you can see and lounging area and Smithies Studying. South (S) of you is the exit and North (N) is the staircase that leds to your room. Where do you go?(Type N,E,S,or W) \n");
            userHouse.methodCaller();

        // Tidy up
      //  userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("GAME OVER. Better luck next time.");
        }
    }       

    }




      
