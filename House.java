import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


/* This is a stub for the House class ADD playerintro EXTENDS??*/
public class House extends PlayerIntro {
    int points = 0;
    boolean active = false;
    String direction;
    int position;
    // String directionInputOne = "";
    // String directionInputTwo = "";
    String startingPointInput = "";
    boolean roommateFriendship;
    // ArrayList<String> potentialDirections = new ArrayList<String>();



    //note for future katie, add N1 or E2 whenever a method is called and if it is do contains and then
    //print a message telling the player they've already done this

    ArrayList<String> inventory = new ArrayList<String>();

    Scanner myObj = new Scanner(System.in);

    public int HouseIntro(int points) {

        // direction = potentialDirections[8];
        //this.points = points;

        System.out.println("-INSERT NAME- walks in to -INSERT HOUSE- 'Wowza!' You say in disbelief as you walk around and look at your potential home for the next 4 years. There's a wide array of Smithies buzzing and getting ready for classes. All of a sudden, your phone rings with an email notification. Do you read it? (Y/N) \n");

        String emailYN = myObj.nextLine();

        if (emailYN.equals("Y")) {
            System.out.println("Nice! It always good to read your emails :D. It states: Hey *characterization[0]*, it's me, Sophia Smith again, I just wanted to tell you you can explore Smith's Campus by going N, E, S, W, there are limitations of course but you should look around, you could meet someone you fancy. You can also add things you find to your inventory by typing 'add' and the object you want. Also, you can impress your crush by talking with them or giving gifts you find. One last thing, while you can have multiple crushes, choosing one main one might make winning them over easier :D Okay, good luck kid *** +10 POINTS *** \n");
            points += 10;
        } else if (emailYN.equals("N")) {
            System.out.println("Well, alright dumbass, that might have been important but, I guess you don't care... Good luck figuring out how to move and do stuff you dumb piece of sh-- okay, okay, I think I might be too mean but I guess this is an important lesson: your choices matter. *** -10 POINTS *** \n");
            //IDK about the math for that
            points -= 10;
        } else {
            System.out.println("Okay, looks like someone can't follow directions. I get it, you're free spirited, I like that. Just explore around campus and collect stuff. Try to find someone that can tolerate your pressence. You can go N,S,E,W. Good luck! (You're gonna need it).  *** -5 POINTS *** \n");
            //IDK about the math for that
            points -= 5;
        }
        System.out.println("With that, it's time for adventure... and love??? A bit overwhemled, you look at everything that beholds you. To the east (E) you can smell some ramen and hear a Smithie bitterly complaining about the food at Smith and further east the thudding of washing machines. To the west (W) you can see and lounging area and Smithies Studying. South (S) of you is the exit and North (N) is the staircase that leds to your room. Where do you go?(Type N,E,S,or W) \n");
        //directionInputOne = myObj.nextLine();
        return points;
    }



    public void northOne() {
        points += 1;
        active = true;
        // potentialDirections.add("N1");

        System.out.println("You walk upstairs and head into your dorm. There to meet you is your roommate(There's a 50/50 chance things will go well).*** +1 POINT *** \n");

        int roommateFriend = (int)(Math.random() * (2 - 1 + 1) + 1);

        if (roommateFriend % 2 == 1) {
            System.out.println("Your roommate smiles when you enter the room. Yay! *** +10 POINTS *** \n");
            roommateFriendship = true;
            points += 10;
        } else {
            System.out.println("Your roommate glares at you and seems to be mad you're breathing so loudly. *** -10 POINTS ***\n");
            roommateFriendship = false;
            points -= 10;
        }

        if (roommateFriendship == true) {
            System.out.println("Hey *characterization[0]*, it's nice to finally meet you in person. I'm Jess, but everyone calls me Jelly.  *Jelly goes back to unpacking* :D \n");
        }


        if (roommateFriendship == false) {
            System.out.println(" 'Oh, hi *characterization[0]*. I guess you want to be in my room... that's cool I guess, I'm Jess' *Jess starts smoking weed (and doesn't even offer to share!) :( * \n");

        }

        System.out.println("You notice a -Smith Cookie- on your roommate's desk. You kind of want it. 'Hey roomie' you say, half smiling, 'Can I have that cookie?'\n ");

        if (roommateFriendship == true) {
            System.out.println("'Sure! I wasn't even going to eat it anyway'\n Cool! Now it's in your nice Conaway Center Tote Bag. *** +5 POINTS *** \n");

            inventory.add("Smith Cookie");
            points += 5;
        }

        if (roommateFriendship == false) {
            System.out.println("'HELL NO, its for Mr.Twinkles' *Jess proceeds to feed the cookie to her unregistered, feral, emotional support rat that lives on your dresser* \n");

        }

        System.out.println("Well, that was fun. *UwU*, I think that's all I can do here. Should I go further into my dorm more north or go back downstairs?(N/S) \n");
    }

    public void northTwo() {

        points += 1;
        active = true;
        //potentialDirections.add("N2");

        System.out.println("*** +1 POINT *** You walk further into your dorm and start unpacking. On your desk you see an old photo of Smithies from the 1800s doing a play. One Smithie is dressed in a gown and another is as a monster. That's werid... Should you take it? (Y/N) \n");
        String deskYN = myObj.nextLine();


        if (deskYN.equals("Y")) {

            inventory.add("old picture");
            points += 5;
            System.out.println("Cool! Now it's in your nice Conaway Center Tote Bag. *** +5 POINTS *** \n");

        } else if (deskYN.equals("N")) {
            System.out.println("Whelp, I'm sure that won't have far reaching consequences. It's just a dumb old picture anyway. \n");
        }

    }

    public void eastOne() {

        points += 1;
        active = true;
        //potentialDirections.add("E1");

        System.out.println("You enter the kitchette and see two Smithies making Peanut Butter Cookies and vibing 'Oh golly' you think to yourself 'I better introduce myself a make some friends' What do you open with? \n **Bust it down (type 'B')** \n **Just introduce yourself (type 'I')** \n **Make Fun of your rival house (type M)** \n");
        String eastActionInput = myObj.nextLine();

        if (eastActionInput.equals("B")) {
            System.out.println("Quirked up you goated with the sause busts it down platonic style and impress them with your sweet moves! *** +15 POINTS *** \n");
            points += 15;
        } else if (eastActionInput.equals("I")) {
            System.out.println("You say 'Hi, my name is -INSERT NAME-' and I live in room 302. It's nice to meet you'. That was kind of basic but they seem to like you. *** +5 POINTS *** \n");
            points += 5;
        } else if (eastActionInput.equals("M")) {
            System.out.println("You start trash talking your rivial house that's basically a clone of your house and gain their respect. Nothing builds camaraderie more than a common enemy. *** +10 POINTS *** \n");
            points += 10;
        } else {
            System.out.println("OH NO! You fail to say anything and now they're really uncomfortable as you stare blankly at them. *** -10 POINTS *** \n");
            points -= 10;

        }
        if (eastActionInput.equals("B") || (eastActionInput.equals("M"))) {
            System.out.println("One of them stops baking and comes closer to you. 'Eh kid' they say in a Brooklyn esqe accent 'I like your style. I found this -Cat Keychain- in the free bin. It's kind of shiny and cringy, like you. Do you want it? (Y/N)' \n");
            String eastActionInputTwo = myObj.nextLine();

            if (eastActionInputTwo.equals("Y")) {
                inventory.add("Cat Keychain");
                points += 5;
                System.out.println("Cool! Now it's in your nice Conaway Center Tote Bag. *** +5 POINTS *** \n");
            } else {
                System.out.println("Alright kid, keep it moving then. \n");
            }

        }
        System.out.println("Well, that looks like that's all we can do in this room. Do you wanna go further east or back to the foyer? (E/S) \n");
    }

    public void eastTwo() {
        points += 1;
        active = true;
        //potentialDirections.add("E2");

        System.out.println("You go further east and end up in the laundry room. There isn't much to see besides washing machines going and a free bin. 'hmmmm' you wonder to yourself 'there's not much to do' Do you wanna look around? (Y/N)  \n");
        String eastActionInputThree = myObj.nextLine();
        if (eastActionInputThree.equals("Y")) {
            System.out.println("Cool! You see a picture of \n *** Mendenhall *** \n *** Campus Center *** \n *** The Nielson *** \n It's always good to be curious and look at your surroundings *** +5 POINTS *** \n Let's go back now");
        } else {
            System.out.println("Alright, let's go back.\n");

        }
    }

    public void southOne() {
        //potentialDirections.add("S1");
        System.out.println("South One");
    }
//this is not very need, it's basically the starting point
    public void southTwo() {
        // potentialDirections.add("S2");
        System.out.println("South Two");
    }


    public void westOne() {
        // potentialDirections.add("W1");
        System.out.println("You enter the lounging area with a few Smithies studying and doing their own thing. 'Oh boy' you think to yourself 'I better not bother them, they look busy'. Do you wanna go further west or back to the foyer? (W/S)\n");
    }

    public void westTwo() {
        // potentialDirections.add("W2");
        System.out.println("Immediately, in the corner of this room, you see a book of Greek Myths with a page hanging out. You go to pick it up but then someone's hand swopes in and takes it. \n 'Hey, I'm crush name[index], I live on the 4th floor.' You notice that they're wearing a shirt for Newsies... they must be a theatre kid. WHAT DO YOU DO??? \n \n **They kind of cute??? (type 'F') for... you know... flirt :D** \n **Start shrieking (type 'S')** \n ** Ask about the book (type B)** \n ");
        String westActionInputOne = myObj.nextLine();
        if (westActionInputOne.equals("F")) {
            System.out.println("EW! That's house incest, which is never a good idea. HOUSE BOOTY = BAD BOOTY *** -10 POINTS *** \n");
            points -= 10;
        } else if (westActionInputOne.equals("S")) {
            System.out.println("You're screaming disorients them and you can get a better look at the book but at what cost??? *** -5 POINTS ***  \n");
            points -= 5;
        } else if (westActionInputOne.equals("B")) {
            System.out.println("'Oh, that's a book I found from Josten. Me and some of my  friends are putting on a play about King Minos of Crete.'crush name[index] says to you. *** +10 POINTS *** \n");
            points += 10;
        } else {
            System.out.println("You just stare blankly at them and crush name[index] hisses at you and walks off as if you've been marked. Nice going! *** -15 POINTS *** \n");
            points -= 15;
        }
        System.out.println("'Well, that was nice and totally not important' you think to yourself as they walk away");
    }

    public void startingPoint() {
        System.out.println("\n You're back in the -INSERT HOUSE- entrance. Where do you wanna go?\n To your dorm? (N) \n To the kitchenette? (E) \n Outside? (S) \n or the lounging area (W) \n");
    }

    public static void main(String[] args) {
        ArrayList<String> potentialDirections = new ArrayList<String>();

        Scanner myObj = new Scanner(System.in);
        House player = new House();
        player.HouseIntro(0);
        //first n,e,s,w choice
        String directionInputOne = myObj.nextLine();
        String directionInputTwo = "";
        String directionInputThree = "";
        String startingPointInput = "";


        switch (directionInputOne) {
        case "N":
            player.northOne();
            potentialDirections.add("N1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();
                potentialDirections.add("N2");

            }
            break;


        case "E":
            player.eastOne();
            potentialDirections.add("E1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("E") && directionInputTwo.equals("E")) {
                System.out.println("now escuting east 2");
                player.eastTwo();
                potentialDirections.add("E2");

            }
            break;

        case "S":
            player.southOne();
            potentialDirections.add("S1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("S") && directionInputTwo.equals("S")) {
                player.southTwo();
                potentialDirections.add("S2");

            }
            break;

        case "W":
            player.westOne();
            potentialDirections.add("W1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("W") && directionInputTwo.equals("W")) {
                player.westTwo();
                potentialDirections.add("W2");
            } else if (directionInputOne.equals("W") && directionInputTwo.equals("S")) {
                player.startingPoint();
                startingPointInput = myObj.nextLine();
            } else {
                System.out.println("That's not an option hehehehheh try again :D");
                startingPointInput = myObj.nextLine();
            }

            break;
        }


/* 
            } else if (startingPointInput.equals("W")) {

                if (directionInputOne.equals("W") == false) {
                    player.westOne();
                } else if (potentialDirections.contains("W1")) {
                    System.out.println("There's not much to see in this room. You should go back to the foyer \n");
                    player.startingPoint();
                }

        */
        
        
        switch (directionInputTwo) {

            case "S":
            player.startingPoint();
            startingPointInput = myObj.nextLine();
          
            break;

        case "N":
            if (directionInputOne.equals("N") == false) {
                player.northOne();
            } else {
                System.out.println("There's not much to see in your dorm. You should go back to the foyer \n");
                player.startingPoint();
                startingPointInput = myObj.nextLine();

                if (startingPointInput.equals("S")) {
                    player.southOne();
                } else if (startingPointInput.equals("N")) {
                    player.northOne();
                } else if (startingPointInput.equals("W")) {
                    player.westOne();
                } else if (startingPointInput.equals("E")) {
                    player.eastOne();
                } else {
                    System.out.println("That's not an option hehehehheh try again :D");
                    startingPointInput = myObj.nextLine();
                }
            }
            break;


        case "E":
            if (directionInputOne.equals("E") == false) {
                player.eastOne();
            } else {
                System.out.println("There's not much to see in the kitchen. You should go back to the foyer \n");
                player.startingPoint();
                startingPointInput = myObj.nextLine();

                if (startingPointInput.equals("S")) {
                    player.southOne();
                } else if (startingPointInput.equals("N")) {
                    player.northOne();
                } else if (startingPointInput.equals("W")) {
                    player.westOne();
                } else if (startingPointInput.equals("E")) {
                    player.eastOne();
                } else {
                    System.out.println("That's not an option hehehehheh try again :D");
                    startingPointInput = myObj.nextLine();
                    break;
                }
            }

        case "W":
            if (directionInputOne.equals("W") == false) {
                player.westOne();
            } else if (potentialDirections.contains("W1")) {
                System.out.println("There's not much to see in this room. You should go back to the foyer \n");
                player.startingPoint();
            }
            startingPointInput = myObj.nextLine();
            if (startingPointInput.equals("S")) {
                player.southOne();
            } else if (startingPointInput.equals("N")) {
                player.northOne();
            } else if (startingPointInput.equals("E")) {
                player.eastOne();
            } else {
                System.out.println("That's not an option hehehehheh try again :D");
                startingPointInput = myObj.nextLine();
            }


        break;
    }
    
    switch (startingPointInput) {
             case "S":
    
        if (startingPointInput.equals("S")) {
            if (potentialDirections.contains("S1") && potentialDirections.contains("S2"))
            System.out.println("You should focus on unexplored areas of the house... I'll take you back to the foyer");
        }

            case "N":
            if (startingPointInput.equals("N")) {

            if (potentialDirections.contains("N1") && potentialDirections.contains("N2"))
            System.out.println("You should focus on unexplored areas of the house... I'll take you back to the foyer");
        
            }
            case "E":
            if (startingPointInput.equals("E")) {

            if (potentialDirections.contains("E1") && potentialDirections.contains("E2"))
            System.out.println("You should focus on unexplored areas of the house... I'll take you back to the foyer");
            }

            case "W":
            if (startingPointInput.equals("W")) {

            if (potentialDirections.contains("W1") && potentialDirections.contains("W2"))
            System.out.println("You should focus on unexplored areas of the house... I'll take you back to the foyer");
            }

       default:

       System.out.println("HERE ARE WHERE THINGS END");
            System.out.println("That's not an option hehehehheh try again :D");
            startingPointInput = myObj.nextLine();
            break;

            }
        }
    }






//note, returning to foyer works but going in a different direction after that doesn't

//to run the code type javac House.java, ls,  java House
//secret ending minatour

//Extend TA  //

//Note, the player can go in the same direction twice successfully, return back to the foyer, and go to a new
//direction but then when they try to go further into the new direction the code crashes.