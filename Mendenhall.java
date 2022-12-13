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
      System.out.println("You enter Mendenhall's basement feeling pretty werid... all of a sudden, a MINOTAUR emerges from the shadows...\n Oh wait, oh god, it's even worse *vomits* its theatre kids!!! "+
      "In one giant, elaborate costume five theatre kids (one of which looks kind of familiar) create a MINOTAUR!! And oh no! They're bullying your crush (the one from Ford). YOU MUST DEFEAT THEM. Pick your wits or the things around you: \n ** Hurt their ego (type 'E')** \n ** Sword!! (type 'S')** \n ** Reference The Little Mermaid the musical??? (type M)**");
      
      String finalBossInput = myObj.nextLine();

      if (finalBossInput.equals("E")) {
          System.out.println(" 'Eh Minotaur!', You shout at the top of your lungs, 'You look stupid'. Simple, but effective! Now they're in their heads and they can't commit. *** +10 POINTS *** \n");
          points += 10;
      } else if (finalBossInput.equals("S")) {
          System.out.println("You grab a prop sword you see on the ground and charge at them! But it's a prop so it snaps in 1/2 on impact ://// Also violence is never the answer *** -5 POINTS *** \n");
          points -= 5;
      } else if (finalBossInput.equals("M")) {
          System.out.println(" For some inexplicable reason, every theatre kid did The Little Mermaid the musical. You You referencing it has distracted them! :D  *** +15 POINTS *** \n");
          points += 15;
      } else {
          System.out.println("OH NO! You don't say anything and now your crush is in danger... or catching feelings for the Minotaur??? *** -10 POINTS *** \n");
          points -= 10;
        }

          System.out.println("This is your last chance to win over your crush and defeat the Minotaur. What's your final move???  \n ** DANCE? (type 'D')** \n ** CRY? (type 'C')** \n ** FLIRT? (type F)**");
     
          String finalBossInputTwo = myObj.nextLine();

          if (finalBossInputTwo.equals("D")) {
              
              System.out.println(" You starting dancing like your life depends on it, which distracts the Minotaur giving your crush a chance to escape. But what about you? *** +15 POINTS *** \n ");
              points += 15;
          } else if (finalBossInputTwo.equals("C")) {
              System.out.println("You start crying and the Minotaur is really invested in what you're doing, giving your crush a chance to escape. But what about you?*** +10 POINTS *** ");
              points += 10;

          } else if (finalBossInputTwo.equals("F")) {
              System.out.println("You flirt with the Minotaur, who was confused at first but is now cool with it, giving your crush time to escape. But what about you? *** +5 POINTS *** \n");
              points += 5;
          } else {
              System.out.println("You don't do ANYTHING AND FAIL \n");
          }
          System.out.println("The minotaur jumps at you and-- to see the final results, write 'C' for continue: \n");

      
    }
//north kind of
    public void Ending() {
      System.out.println("\n YOU... ~Calculating Points~ \n");

      int EndingRandomizer = (int)(Math.random() * (2 - 1 + 1) + 1);

      
      if (EndingRandomizer % 2 == 1) {
        // win message// win crush / defeat minotaur
        System.out.println("You win!");
        WinOrLose = true;
    } else {
      //lose message/ lost crush and minotaur
      System.out.println("You lose!");

        WinOrLose = false;
    }
      

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
            if (directionInputOneMH.equals("S") && directionInputTwoMH.equals("C")) {
                player.Ending();

            } 

            break;

            case "N":
            System.out.println("On the roof top, you are amazed by the beauty of Smith College. Yet, something is still compelling you to do to the basement.");
            player.finalBoss();
            directionInputTwoMH = myObj.nextLine();
            if (directionInputTwoMH.equals("C")) {
              player.Ending();
            }

              break;

            case "E":
            System.out.println("To the east, you end up in Acting Studio 2 but, something isn't right. You feel an urge to check out the basement");
            player.finalBoss();
            directionInputTwoMH = myObj.nextLine();
              if (directionInputTwoMH.equals("C")) {
              player.Ending();
            }           
             break;


            case "W":
            System.out.println("To the west, you end of in Hallie Flanagan Studio Theatre. Despite no one being here, you hear whispers telling you to go to the basement.");
            player.finalBoss();
            directionInputTwoMH = myObj.nextLine();
            if (directionInputTwoMH.equals("C")) {
              player.Ending();
            }
            break;


        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to the basement *** -5 POINTS *** \n");
                player.finalBoss();
                directionInputTwoMH = myObj.nextLine();
                if (directionInputTwoMH.equals("C")) {
                  player.Ending();
                }

             
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

