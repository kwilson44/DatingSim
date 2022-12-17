import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

  //to run the code type javac PlayerIntro.java, ls,  java PlayerIntro

public class PlayerIntro {    

  static void GamerMethod() {
  
    ArrayList<String> inventory = new ArrayList<String>();     
    //records inventory
    ArrayList<String> characterization = new ArrayList<String>();  
//Arrays of Smith Houses
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
       characterization.add(InputName);
        System.out.println("Well, it's nice to meet you " + InputName + "! Let's begin. What neighborhood do you wanna live in? Enter 'A' for Garden Neighborhood, 'B' for Ivy Neighborhood, 'C' for Mountain Neighborhood, 'D' for Paradise Neighborhood and 'E' for Special Interest Housing: ");
        String userInputNeighborhood = myObj.nextLine();

        if(userInputNeighborhood.equals("A")) {
            double index = (int)(Math.random()*(((gardenNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
           String House = gardenNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + House);
            characterization.add(House);



        } else if (userInputNeighborhood.equals("B")) {
            double index = (int)(Math.random()*(((ivyNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
           String House = ivyNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + House);
            characterization.add(House);


        } else if (userInputNeighborhood.equals("C")) {
            double index = (int)(Math.random()*(((mountainNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            String House = mountainNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + House);
            characterization.add(House);


        } else if (userInputNeighborhood.equals("D")) {
            double index = (int)(Math.random()*(((paradiseNeighborhood.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            String House = paradiseNeighborhood[houseIndex];
            System.out.println("Great! Welcome to " + House);
            characterization.add(House);

        } else if(userInputNeighborhood.equals("E")) {
            double index = (int)(Math.random()*(((specialInterestHousing.length-1)-0)+1))+0;
            //for the randomization of houses
            int houseIndex = (int) index;
            String House = specialInterestHousing[houseIndex];
            System.out.println("Great! Welcome to " + House);
            characterization.add(House);

        } else {
            System.out.println("That wasn't an option... You know what? You had your chance, we're putting you in Sessions, have fun with the ghosts.");
         String House = "SESSIONS HOUSE";
          characterization.add(House);

        }        

      System.out.println("Now, what's your class year?");
      int userInputClassYear = myObj.nextInt();
      

        
      if (userInputClassYear == 2026 || userInputClassYear == 2025 || userInputClassYear== 2024 || userInputClassYear == 2023) {

        //characterization.add(userInputClassYear);
        } else {
        System.out.println("Try again! *hint* *hint* 2026,2025,2024,2023");
        userInputClassYear = myObj.nextInt();
       // characterization.add(userInputClassYear);

        }
      
       // myObj.close();
  }
  
    public static void main(final String[] args) {
      GamerMethod();

      System.out.println("Excellent, you're ready to begin 🎮 !");
  }

}