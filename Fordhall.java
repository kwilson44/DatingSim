import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Fordhall extends PlayerIntro {
    int points = 0;
    boolean active = false;
    String direction;
    int position;
    boolean funQuestion;


//PLACEHOLDER
    ArrayList<String> inventory = new ArrayList<String>();

    Scanner myObj = new Scanner(System.in);


    public void northOne() {
               //Smithie on a balcony that wants a cookie
               int funQuestionReactionRandomizer = (int)(Math.random() * (2 - 1 + 1) + 1);


        System.out.println("You head up to the balcony in Fordhall. There's a lone Smithie looking into the horizen. \n There are cherry blossoms swaying in the wind even though we're in MA... just don't think about it \n " +
         "'Oh! You scared me.' Quick!! Pick something cool to say, first impressions matter! \n ** Honest explanation (type 'H')** \n **LIE??? (type 'L')** \n ** Compliment??? (type C)**");

       String northActionInput = myObj.nextLine();

        if (northActionInput.equals("H")) {
            System.out.println(" 'I.. uh, wanted to see what was up there, I didn't mean to startle you' You say to them. They seem to be impressed by your honesty and like your awkwardness *** +10 POINTS *** \n");
            points += 10;
        } else if (northActionInput.equals("L")) {
            System.out.println("You say 'I... wanted to... see if there were any ghosts up here. Yeah, that's it, ~ghosts~'. They seem to know you're lying but don't care enough... Success, I guess, but lying isn't good! *** +1 POINTS *** \n");
            points += 1;
        } else if (northActionInput.equals("C")) {
            System.out.println("'Woah!' You say 'Those are cool socks!' The said socks are green and have corgis on them. Your crush is so flattered you noticed and blushes!! *** +15 POINTS *** \n");
            points += 15;
        } else {
            System.out.println("OH NO! You fail to say anything and now they're having a pretend phone with their friend because you scared them so much :((((. *** -10 POINTS *** \n");
            points -= 10;

        }
        if (northActionInput.equals("H") || (northActionInput.equals("C")) || (northActionInput.equals("L"))) {
            System.out.println("'I'm INSERT NAME by the' they say. Okay, here's your chance! What do you do next??? \n ** Smooth Talk (type 'S')** \n ** Ask Fun Question (type 'Q')** \n ** Ask why they're up here (type A)**");
       
            String northActionInputTwo = myObj.nextLine();

            if (northActionInputTwo.equals("S")) {
                
                System.out.println("You start sweating profusely and think about all those TikToks you watched. Nervously, you bite your lower lip, squint your eyes, and say 'Heyyyyyy, would you wanna, Compass Cafe... I mean, if you're not, not to say, uhhhhh, you seem nice... coffee? :D' Well... it's not like you've offended them *** +5 POINTS *** ");
                points += 5;
            } else if (northActionInputTwo.equals("Q")) {
                System.out.println("You smile nervously and say'Are you a cat person or a dog person?' ");
                if (funQuestionReactionRandomizer % 2 == 1) {
                    System.out.println(" 'I love both! Thanks for asking... cutie ;)' *** +10 POINTS *** \n");
                    funQuestion = true;
                    points += 10;
                } else {
                    System.out.println(" 'DOGS AND CATS ARE ALWAYS MEAN TO ME... God, you ruined my day!!' *** -10 POINTS ***\n");
                    funQuestion = false;
                    points -= 10;
                }
            } else if (northActionInputTwo.equals("A")) {
                System.out.println(" 'Oh, I'm just killing time... I ordered a snack at the Compass Cafe but I'm like 534 in line :(  I just wish I had a cookie or something' *** +5 POINTS ***\n");
                if (inventory.contains("Smith Cookie")){
                    System.out.println(" 'Hey... I think you're really neat! I have this Smith Cookie, do you want it?' \n Your crush smiles at you'WOW! THANK YOU SO MUCH!!'  *** +15 POINTS *** \n");
                } else {

                }
            }

        } 
    }

    public void northTwo() {

   
    }

    public void eastOne() {
// Smithie coding
    }

    public void eastTwo() {
       
    }


    public void westOne() {
        //smithie wants cat key chain
    }

    public void westTwo() {
        
    }

    public void startingPoint() {
        System.out.println("\n Well, that was fun! Better get to your actual class in Mendenhall \n");
    }

    public static void main(String[] args) {
//Just vibing


    }

    public void methodCaller() {
        
        Scanner myObj = new Scanner(System.in);
        House player = new House();
        String directionInputOne = myObj.nextLine();
        String directionInputTwo = "";


        switch (directionInputOne) {
            case "N":
            player.northOne();
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();

            } else if (directionInputOne.equals("N") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
            break;


        case "E":
            player.eastOne();
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("E") && directionInputTwo.equals("E")) {
                player.eastTwo();

            } else if (directionInputOne.equals("E") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
            break;



        case "W":
        player.westOne();
        directionInputTwo = myObj.nextLine();
        if (directionInputOne.equals("W") && directionInputTwo.equals("W")) {
            player.westTwo();

        } else if (directionInputOne.equals("W") && directionInputTwo.equals("S")){
            player.startingPoint();
            }
        break;

        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to your dorm *** -5 POINTS *** \n");
                player.northOne();
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();

            } else if (directionInputOne.equals("N") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
        break;
        }



   
        switch (directionInputTwo) {

            case "S":
            player.startingPoint();
          
            break;

            case "N":
            if (directionInputOne.equals("N") == false) {
                player.northOne();
            } else {
                System.out.println("OwO! It looks like your senpai left... it's oftenly drafty here, we should go back to the lobby. \n");
                player.startingPoint();

            
                break;
            }


        case "E":
            if (directionInputOne.equals("E") == false) {
                player.eastOne();
            } else {
                System.out.println("Well, that happened. You should probably let them code now :D \n");
                player.startingPoint();

            
                break;
            }

        case "W":
            if (directionInputOne.equals("W") == false) {
                player.westOne();
            } else {
                System.out.println("Well, there's not much to do now \n");
                player.startingPoint();
            }
        


        break;
    }

 

        }
    }

