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
    String eastActionInput = myObj.nextLine();

    System.out.println("You approach the lounge area by the entrance of Ford, noticing that several students have set up camp on the sofas. \n There is a lone Smithie sitting by the window, staring at their computer with a thousand-yard stare. As an empath, you get the sense that they may be stressed. \n'I am so stressed.', they say. 'My CS homework is due in 5 minutes, but I forgot how to write javadoc comments!! What should I do? \n ** Helpful Answer (type 'H') \n ** Pair programming? (type 'P') \n ** Unsolicited Pep Talk ('U')");
    if (eastActionInput.equals("H")) {
        System.out.println("You puff out ur chest and smile cooly. Finally, you know something useful! 'Here, I have a template to help with that,' you say, lifting your arm up to show them the notes written on your wrist. A little weird, but okay- they seem too desperate to care anyways! *** +10 POINTS *** ");
        points += 10;
    } else if (eastActionInput.equals("P")) {
        System.out.println("You sit down on the table and take their laptop into your hands, beginning to type on the keyboard frantically. They stare at you with a wide-eyed look of horror. Yeah no, that's not pair programming...and now your grubby hands have been all over their computer. Whoops. *** -10 POINTS ***");
        points -= 10;
    } else if (eastActionInput.equals("U")) {
        System.out.println("'It's fine, who even cares about documentation? Just chill, you'd feel better if you drink some water!' They've already begun shoving their things into their bag before you've even finished talking. Nice job. *** -15 POINTS ***");
        points -= 15;
    } else {
        System.out.println("YIKES, you were too slow to react and are now staring at them silently. The slight smile on your face is enough to scare them off completely. *** -15 POINTS *** \n");
        points -= 15;
    }
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
        String directionInputOneFH = myObj.nextLine();
        String directionInputTwo = "";


        switch (directionInputOneFH) {
            case "N":
            player.northOne();
            directionInputTwo = myObj.nextLine();
            if (directionInputOneFH.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();

            } else if (directionInputOneFH.equals("N") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
            break;


        case "E":
            player.eastOne();
            directionInputTwo = myObj.nextLine();
            if (directionInputOneFH.equals("E") && directionInputTwo.equals("E")) {
                player.eastTwo();

            } else if (directionInputOneFH.equals("E") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
            break;



        case "W":
        player.westOne();
        directionInputTwo = myObj.nextLine();
        if (directionInputOneFH.equals("W") && directionInputTwo.equals("W")) {
            player.westTwo();

        } else if (directionInputOneFH.equals("W") && directionInputTwo.equals("S")){
            player.startingPoint();
            }
        break;

        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to your dorm *** -5 POINTS *** \n");
                player.northOne();
            directionInputTwo = myObj.nextLine();
            if (directionInputOneFH.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();

            } else if (directionInputOneFH.equals("N") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
        break;
        }



   
        switch (directionInputTwo) {

            case "S":
            player.startingPoint();
          
            break;

            case "N":
            if (directionInputOneFH.equals("N") == false) {
                player.northOne();
            } else {
                System.out.println("OwO! It looks like your senpai left... it's oftenly drafty here, we should go back to the lobby. \n");
                player.startingPoint();

            
                break;
            }


        case "E":
            if (directionInputOneFH.equals("E") == false) {
                player.eastOne();
            } else {
                System.out.println("Well, that happened. You should probably let them code now :D \n");
                player.startingPoint();

            
                break;
            }

        case "W":
            if (directionInputOneFH.equals("W") == false) {
                player.westOne();
            } else {
                System.out.println("Well, there's not much to do now \n");
                player.startingPoint();
            }
        


        break;
    }

 

        }
    }

