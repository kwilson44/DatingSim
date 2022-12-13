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
      System.out.println("You enter Mendenhall feeling pretty werid...");
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
            case "S":
            player.finalBoss();
            directionInputTwoMH = myObj.nextLine();
            if (directionInputOneMH.equals("S") && directionInputTwoMH.equals("S")) {
                player.Ending();

            } 

            break;

            case "N":
            System.out.println("On the roof top, you are amazed by the beauty of Smith College. Yet, something is still compelling you to do to the basement.");
            player.finalBoss();
            player.Ending();
            break;

            case "E":
            System.out.println("To the east, you end up in Acting Studio 2 but, something isn't right. You feel an urge to check out the basement");
            player.finalBoss();
            player.Ending();
            break;


            case "W":
            System.out.println("To the west, you end of in Hallie Flanagan Studio Theatre. Despite no one being here, you hear whispers telling you to go to the basement.");
            player.finalBoss();
            player.Ending();
            break;


        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to the basement *** -5 POINTS *** \n");
                player.finalBoss();
                
                player.Ending();

             
        break;
          }



   
        switch (directionInputTwoMH) {

          
          
            case "S":
            if (directionInputOneMH.equals("S") == false) {
                player.finalBoss();
            } else {
                System.out.println(" \n");
                player.Ending();

            
                break;
            }


          

 

        }
      }
    }

