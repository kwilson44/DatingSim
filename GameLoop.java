import java.util.Scanner;
import java.util.ArrayList;
//import House.java;

public class GameLoop {
  
    public static void main(String[] args) {
;
    Scanner myObj = new Scanner(System.in);
    String playerHouse ="";         
   ArrayList<String> inventory = new ArrayList<String>();


    System.out.println("**************************************");
    System.out.println("*💖 SMITH COLLEGE DATING SIMULATOR 💖*");
    System.out.println("**************************************");

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

        System.out.println("Well, it's nice to meet you " + InputName + "! Let's begin. What neighborhood do you wanna live in?  Enter: \n 'A' for Garden Neighborhood, \n 'B' for Ivy Neighborhood, \n 'C' for Mountain Neighborhood, \n 'D' for Paradise Neighborhood \n 'E' for Special Interest Housing: ");
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

            Player currentUser = new Player(InputName, userInputClassYear, playerHouse,inventory);

            House userHouse = new House();
            Fordhall userFordhall = new Fordhall();
            Mendenhall userMendenhall = new Mendenhall();
              // Execute the beginning of the game by calling the House Intro, starting the player
              // at the initial location of their House.
              System.out.println(currentUser.name + " walks in to " + currentUser.userHouse + " 'Wowza!' You say in disbelief as you walk around and look at your potential home for the next 4 years. There's a wide array of Smithies buzzing and getting ready for classes. All of a sudden, a similar looking women appears: \n Hey, it's me, Sophia Smith again, I just wanted to tell you you can explore Smith's Campus by going N(orth), E(ast), W(est), there are limitations so pick wisely. \n Also, you can impress your crush by talking with them or giving gifts you find. \n Okay, good luck kid :D \n");

              

              System.out.println("With that, it's time for adventure... and love??? A bit overwhemled, you look at everything that beholds you. To the east (E) you can smell some ramen and hear a Smithie bitterly complaining about the food at Smith and further east the thudding of washing machines. \n To the west (W) you can see and lounging area and Smithies Studying. \n North (N) is the staircase that leds to your room.\n Where do you go?(Type N,E,or W) \n");
              userHouse.methodCaller();
              System.out.println("\n You rush over to Fordhall, making just in time at 9:19... \n only to realize you came here for your Tuesday/Thursday CS class and TODAY IS MONDAY!!\n 'How silly, and goofy of me' you think to yourself. \n'Whelp, since I'm here already and I only have Theatre class today, might as well look around :D'\n North of you, there's a balcony with someone up there! \n  East of you there seems to be a Smithie coding by themselves! \n  To the West, there's a Smithie hanging up a poster (N/E/W)");
              userFordhall.methodCaller();
              System.out.println("You enter Mendenhall, no one's here and the lights are flashing. \nThere's rumbling beneanth your feet that's coming from the basement that's down south. \n Where do you go? (N/E/S/W) ");
              userMendenhall.methodCaller();

              System.out.println("    ~~THANKS FOR PLAYING~~");
              System.out.println("********************************");
              System.out.println("💖SMITH COLLEGE DATING SIMULATOR💖");
              System.out.println("********************************");
              myObj.close();

    }       

    }


//different messages for later based on points