import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Mendenhall extends PlayerIntro {
    int points = 0;
    boolean active = false;
    String direction;
    int position;
    boolean winOrLose;


//PLACEHOLDER
    ArrayList<String> inventory = new ArrayList<String>();

    Scanner myObj = new Scanner(System.in);

//north kinda
    public void finalBoss() {
      System.out.println("You enter Mendenhall's basement feeling pretty werid... all of a sudden, a MINOTAUR emerges from the shadows...\n And oh no! They're bullying your crush (the one from Ford). YOU MUST DEFEAT THEM. Pick your wits or the things around you: \n ** Hurt their ego (type 'E')** \n ** Sword!! (type 'S')** \n ** Reference The Little Mermaid the musical??? (type M)**");
      
      String finalBossInput = myObj.nextLine();

      if (finalBossInput.equals("E")) {
          System.out.println(" 'Eh Minotaur!', You shout at the top of your lungs, 'You look stupid'. Simple, but effective! Now they feel bad. *** +10 POINTS *** \n");
          points += 10;
      } else if (finalBossInput.equals("S")) {
          System.out.println("You grab a prop sword you see on the ground and charge at them! But it's a prop so it snaps in 1/2 on impact ://// Also violence is never the answer *** -5 POINTS *** \n");
          points -= 5;
      } else if (finalBossInput.equals("M")) {
          System.out.println(" For some inexplicable reason, you reference The Little Mermaid the musical. You referencing it has distracted them for some reason! :D  *** +15 POINTS *** \n");
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
public void Ending() {
    //50/50 chance of success
  int fightSuccess = (int)(Math.random() * (2 - 1 + 1) + 1);
  if (fightSuccess % 2 == 1) {
    System.out.println("As the minotaur lurches forward, its legs begin to wobble, and you see its midsection start to shake back and forth as its head sways wildly. The monster suddenly collapses to the floor in a heap of grey and brown, falling apart to reveal...3 smithies stacked on top of each other? Well, you won the fight! CONGRATS \n");
    winOrLose = true;
    points += 10;
} else {
    System.out.println("The minotaur lands its stride and lunges right towards you, arcing a long cardboard tube down onto your head. Ow, that hurt and made you feel pretty stupid and silly. \n Panting, you step back, completely exhausted from your efforts. The Minotaur begins laughing now, its deep rumble like the sound of 2 to 3 college students laughing under their breaths from beneath a costume. Uh oh. It looks like this fight is over. \n");
    winOrLose = false;
    points -= 10;
}
if (winOrLose == true) {
    System.out.println("As the 'Minotaur' scrapes themsel(ves?) together and trudges away down the hall towards the costume shop, your Crush reappears and runs up to you, looking a bit flustered. They give you a grin and begin laughing, seeming to share in your incredulity at the situation. \n 'Hey, thanks for helping me out back there. I'm not sure how I'd have handle all that if you weren't around'. Nice! You kept them safe from the theater students' antics!! \n" +
    "'You're a pretty cool person, PLAYERNAME. We should get coffee together sometime :)' YAYY!! Looks like this could be the start of something special...or at least a nice healthy friendship!");
}
if (winOrLose == false) {
    System.out.println("You hunch over, trembling, nerves frayed with the hope that your crush will come back for you, but they're now nowhere to be seen. You stand frozen and left behind as the Minotaur points at laughs at you for being such a complete and utter loser. Better luck next time... GAME OVER! \n");
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

