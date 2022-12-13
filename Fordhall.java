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
         "'Oh! You scared me.'Says Portabella (she/her pronouns). She's friends with Katie and Erin and Pre-Med :D but also she's an Aries and from Ohio :( . She's wearing gothic cottagecore clothes. Quick!! Pick something cool to say, first impressions matter! \n ** Honest explanation (type 'H')** \n **LIE??? (type 'L')** \n ** Compliment??? (type C)**");

       String northActionInput = myObj.nextLine();

        if (northActionInput.equals("H")) {
            System.out.println(" 'I.. uh, wanted to see what was up there, I didn't mean to startle you' You say to her. She seem to be impressed by your honesty and like your awkwardness *** +10 POINTS *** \n");
            points += 10;
        } else if (northActionInput.equals("L")) {
            System.out.println("You say 'I... wanted to... see if there were any ghosts up here. Yeah, that's it, ~ghosts~'. She seems to know you're lying but don't care enough... Success, I guess, but lying isn't good! *** +1 POINTS *** \n");
            points += 1;
        } else if (northActionInput.equals("C")) {
            System.out.println("'Woah!' You say 'Those are cool socks!' The said socks are green and have corgis on them. Your crush is so flattered you noticed and blushes!! *** +15 POINTS *** \n");
            points += 15;
        } else {
            System.out.println("OH NO! You fail to say anything and now she's having a pretend phone with their friend because you scared her so much :((((. *** -10 POINTS *** \n");
            points -= 10;

        }
        if (northActionInput.equals("H") || (northActionInput.equals("C")) || (northActionInput.equals("L"))) {
            System.out.println("'I'm Portabella but everyone calls me Porty' she says. Okay, here's your chance! What do you do next??? \n ** Smooth Talk (type 'S')** \n ** Ask Fun Question (type 'Q')** \n ** Ask why she's up here (type A)**");
       
            String northActionInputTwo = myObj.nextLine();

            if (northActionInputTwo.equals("S")) {
                
                System.out.println("You start sweating profusely and think about all those TikToks you watched. Nervously, you bite your lower lip, squint your eyes, and say 'Heyyyyyy, would you wanna, Compass Cafe... I mean, if you're not, not to say, uhhhhh, you seem nice... coffee? :D' Well... it's not like you've offended her *** +5 POINTS *** ");
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
                points+=5;
                if (inventory.contains("Smith Cookie")){
                    System.out.println(" 'Hey... I think you're really neat! I have this Smith Cookie, do you want it?' \n Your crush smiles at you'WOW! THANK YOU SO MUCH!!'  *** +15 POINTS *** \n");
                } else {
                    System.out.println("'Gee, that sucks' you say sheepishly, wishing you could help. Because of your empathy: *** +5 POINTS ***");

                }
            } else {
                System.out.println("Well, now Portabella is calling CAMPO. Good job. \n");
            }
            System.out.println("Welp, that was fun. Do you wanna look around/go more north or go back to the lobby?(N/S) \n");

        } 
    }

    public void northTwo() {

        System.out.println("You look off into the distance and see Mendenhall in all it's glory. There seems to be an ominous trembling coming from it... that's weird??? \n");
    }

    public void eastOne() {
// Smithie coding

    System.out.println("You approach the lounge area by the entrance of Ford, noticing that several students have set up camp on the sofas. \n There is a lone Smithie sitting by the window, staring at their computer with a thousand-yard stare. As an empath, you get the sense that they may be stressed. \n'I am so stressed.', they say. 'My CS homework is due in 5 minutes, but I forgot how to write javadoc comments!! What should I do? \n ** Helpful Answer (type 'H') \n ** Pair programming? (type 'P') \n ** Unsolicited Pep Talk ('U')");
    String eastActionInput = myObj.nextLine();
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
    System.out.println("Well, that happened. Wanna go further east or back where you started? (E/S)");
    }

    public void eastTwo() {
        System.out.println("Oops there's not a lot to see lol");
    }


    public void westOne() {
        System.out.println("You approach a Smithie hanging up a missing cat poster. Bicheal (he/him pronouns) has a cool taste in music and likes nature :D but he's also kind of cringe and an art major :((((( 'Dang, he's pretty cute. Should I approach him further west?' (W/S)");
    }

    public void westTwo() {

        System.out.println("You apporach Bicheal and begin to panic! What's your opener?  \n ** Ask about name (type 'A')** \n ** Wink Agressively(type 'W')** \n ** Say Hi (type H)**");

        String westActionInput = myObj.nextLine();

        if (westActionInput.equals("A")) {
            System.out.println(" 'So... Bicheal?' You say nervously with a smile. Bicheal smiles back at you! 'Yeah, it's a family name. I go by Bike for short'  *** +5 POINTS *** \n");
            points += 5;
        } else if (westActionInput.equals("W")) {
            System.out.println("You wink agressively and Bicheal who is throughly confused. Although, he thinks it's silly (in a good way!) *** +15 POINTS *** \n");
            points += 15;
        } else if (westActionInput.equals("H")) {
            System.out.println(" You say hi... Bicheal says hi back and then goes back to what he was doing *** +10 POINTS *** \n");
            points += 10;
        } else {
            System.out.println("OH NO! You fail to say anything and now he's shuffling around and uncomfy :((((. *** -10 POINTS *** \n");
            points -= 10;

        }
        if (westActionInput.equals("A") || (westActionInput.equals("W")) || (westActionInput.equals("H"))) {
            System.out.println("'Bicheal (or Bike) steps closer with a little smile. Okay, here's your chance! What do you do next??? \n ** Just say it (type 'J')** \n ** Compliment (type 'C')** \n ** Break it down~ (type B)**");
       
            String westActionInputTwo = myObj.nextLine();

            if (westActionInputTwo.equals("J")) {
                
                System.out.println("You take a deep breath and just say it 'Hey, I think you're cool and I'd like to hangout with you or something. Are you on Instagram?' \n * PAUSE *\n BIKE GAVE YOU HIS INSTA :D *** +20 POINTS *** \n ");
                points += 20;
            } else if (westActionInputTwo.equals("C")) {
                System.out.println("You compliment Bike's doc martens and he's really flattered! :D *** +10 POINTS *** ");
                points += 10;

            } else if (westActionInputTwo.equals("B")) {
                System.out.println("You ~break it down~ by having a nervous breakdown because you're so nervous. Even if Bike is really worried/confused now, your feelings are valid *** +5 POINTS *** \n");
                points += 5;
            } else {
                System.out.println("Well, now he's pretending to read a text messsage because you didn't say anything. Good job. \n");
            }

        }
        

    }

    public void startingPoint() {
        System.out.println("\n Well, that was fun! Better get to your actual class in Mendenhall \n");
    }

    public static void main(String[] args) {
//Just vibing


    }

    public void methodCaller() {
        
        Scanner myObj = new Scanner(System.in);
        Fordhall player = new Fordhall();
        String directionInputOneFH = myObj.nextLine();
        String directionInputTwoFH = "";


        switch (directionInputOneFH) {
            case "N":
            player.northOne();
            directionInputTwoFH = myObj.nextLine();
            if (directionInputOneFH.equals("N") && directionInputTwoFH.equals("N")) {
                player.northTwo();

            } else if (directionInputOneFH.equals("N") && directionInputTwoFH.equals("S")){
                player.startingPoint();
                }
            break;


        case "E":
            player.eastOne();
            directionInputTwoFH = myObj.nextLine();
            if (directionInputOneFH.equals("E") && directionInputTwoFH.equals("E")) {
                player.eastTwo();

            } else if (directionInputOneFH.equals("E") && directionInputTwoFH.equals("S")){
                player.startingPoint();
                }
            break;



        case "W":
        player.westOne();
        directionInputTwoFH = myObj.nextLine();
        if (directionInputOneFH.equals("W") && directionInputTwoFH.equals("W")) {
            player.westTwo();

        } else if (directionInputOneFH.equals("W") && directionInputTwoFH.equals("S")){
            player.startingPoint();
            }
        break;

        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to the balcony *** -5 POINTS *** \n");
                player.northOne();
                directionInputTwoFH = myObj.nextLine();
            if (directionInputOneFH.equals("N") && directionInputTwoFH.equals("N")) {
                player.northTwo();

            } else if (directionInputOneFH.equals("N") && directionInputTwoFH.equals("S")){
                player.startingPoint();
                }
        break;
        }



   
        switch (directionInputTwoFH) {

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
                System.out.println("And just like that, Bike left and there's not much to do now. \n");
                player.startingPoint();
            }
        


        break;
    }

 

        }
    }

