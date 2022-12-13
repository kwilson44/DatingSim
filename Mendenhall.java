import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Mendenhall extends PlayerIntro {
    int points = 0;
    boolean active = false;
    String direction;
    int position;
    boolean WinOrLose;


//PLACEHOLDER
    ArrayList<String> inventory = new ArrayList<String>();

    Scanner myObj = new Scanner(System.in);

//north kinda
    public void finalBoss() {
      //Dialoge to fight
      System.out.println("\n Well, that was fun! Better get to your actual class in Mendenhall \n");

    }
//north kind of
    public void Ending() {
      System.out.println("\n Well, that was fun! Better get to your actual class in Mendenhall \n");
      //50/50 chance of success


    }



    public void startingPoint() {
        System.out.println("\n Well, that was fun! Better get to your actual class in Mendenhall \n");

    }

    public static void main(String[] args) {
//Just vibing


    }

    public void methodCaller() {
        
        Scanner myObj = new Scanner(System.in);
        Mendenhall player = new Mendenhall();
        String directionInputOneMH = myObj.nextLine();
        String directionInputTwoMH = "";


        switch (directionInputOneMH) {
            case "N":
            player.finalBoss();
            directionInputTwoMH = myObj.nextLine();
            if (directionInputOneMH.equals("N") && directionInputTwoMH.equals("N")) {
                player.Ending();

            } else if (directionInputOneMH.equals("N") && directionInputTwoMH.equals("S")){
                player.startingPoint();
                }
            break;


        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to your dorm *** -5 POINTS *** \n");
                player.finalBoss();
                directionInputTwoMH = myObj.nextLine();
            if (directionInputOneMH.equals("N") && directionInputTwoMH.equals("N")) {
                player.Ending();

            } else if (directionInputOneMH.equals("N") && directionInputTwoMH.equals("S")){
                player.startingPoint();
                }
        break;
        }



   
        switch (directionInputTwoMH) {

          
          
            case "S":
            if (directionInputOneMH.equals("S") == false) {
                player.finalBoss();
            } else {
                System.out.println("OwO! It looks like your senpai left... it's oftenly drafty here, we should go back to the lobby. \n");
                player.startingPoint();

            
                break;
            }


          

 

        }
      }
    }

