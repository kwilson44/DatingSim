import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class House extends PlayerIntro {
    int points = 0;
    boolean active = false;
    String direction;
    int position;
    boolean roommateFriendship;
    // ArrayList<String> potentialDirections = new ArrayList<String>();



    //note for future katie, add N1 or E2 whenever a method is called and if it is do contains and then
    //print a message telling the player they've already done this

    ArrayList<String> inventory = new ArrayList<String>();

    Scanner myObj = new Scanner(System.in);



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
            System.out.println("Hey! It's nice to finally meet you in person. I'm Jess, but everyone calls me Jelly.  *Jelly goes back to unpacking* :D \n");
        }


        if (roommateFriendship == false) {
            System.out.println(" 'Oh, hi. I guess you want to be in my room... that's cool I guess, I'm Jess' *Jess starts smoking weed (and doesn't even offer to share!) :( * \n");

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
            System.out.println("Cool! You see a picture of \n *** Mendenhall *** \n *** Ford Hall *** \n *** The Nielson *** \n It's always good to be curious and look at your surroundings *** +5 POINTS *** \n Let's go back now");
        } else {
            System.out.println("Alright, let's go back.\n");

        }
    }


    public void westOne() {
        // potentialDirections.add("W1");
        System.out.println("You enter the lounging area with a few Smithies studying and doing their own thing. 'Oh boy' you think to yourself 'I better not bother them, they look busy'. Do you wanna go further west or back to the foyer? (W/S)\n");
    }

    public void westTwo() {
        // potentialDirections.add("W2");
        System.out.println("Immediately, in the corner of this room, you see a book of Greek Myths with a page hanging out. You go to pick it up but then someone's hand swopes in and takes it. \n 'Hey, I'm Alex (they/them), I live on the 4th floor.' You notice that they're wearing a shirt for Newsies... they must be a theatre kid. WHAT DO YOU DO??? \n \n **They kind of cute? Flirt???(type 'F')** \n **Start shrieking (type 'S')** \n ** Ask about the book (type B)** \n ");
        String westActionInputOne = myObj.nextLine();
        if (westActionInputOne.equals("F")) {
            System.out.println("EW! That's house incest, which is never a good idea. HOUSE BOOTY = BAD BOOTY *** -10 POINTS *** \n");
            points -= 10;
        } else if (westActionInputOne.equals("S")) {
            System.out.println("You're screaming disorients them and you can get a better look at the book but at what cost??? *** -5 POINTS ***  \n");
            points -= 5;
        } else if (westActionInputOne.equals("B")) {
            System.out.println("'Oh, that's a book I found from Josten. Me and some of my  friends are putting on a play about King Minos of Crete.'Alex says to you. *** +10 POINTS *** \n");
            points += 10;
        } else {
            System.out.println("You just stare blankly at them and Alex hisses at you and walks off as if you've been marked. Nice going! *** -15 POINTS *** \n");
            points -= 15;
        }
        System.out.println("'Well, that was nice and totally not important' you think to yourself as they walk away");
    }

    public void startingPoint() {
        System.out.println("\n You're back in the foyer. OH NOOOOOOO UwU you're going to be late for class!!!! You should get to Ford \n");
    }

    public static void main(String[] args) {
//Just vibing


    }

    public void methodCaller() {
        ArrayList<String> potentialDirections = new ArrayList<String>();

        Scanner myObj = new Scanner(System.in);
        House player = new House();
        String directionInputOne = myObj.nextLine();
        String directionInputTwo = "";


        switch (directionInputOne) {
            case "N":
            player.northOne();
            potentialDirections.add("N1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();
                potentialDirections.add("N2");

            } else if (directionInputOne.equals("N") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
            break;


        case "E":
            player.eastOne();
            potentialDirections.add("E1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("E") && directionInputTwo.equals("E")) {
                player.eastTwo();
                potentialDirections.add("E2");

            } else if (directionInputOne.equals("E") && directionInputTwo.equals("S")){
                player.startingPoint();
                }
            break;



        case "W":
        player.westOne();
        potentialDirections.add("W1");
        directionInputTwo = myObj.nextLine();
        if (directionInputOne.equals("W") && directionInputTwo.equals("W")) {
            player.westTwo();
            potentialDirections.add("W2");

        } else if (directionInputOne.equals("W") && directionInputTwo.equals("S")){
            player.startingPoint();
            }
        break;

        default:
                System.out.println("Confused, and maybe unable to follow instructions, you stumble to your dorm *** -5 POINTS *** \n");
                player.northOne();
            potentialDirections.add("N1");
            directionInputTwo = myObj.nextLine();
            if (directionInputOne.equals("N") && directionInputTwo.equals("N")) {
                player.northTwo();
                potentialDirections.add("N2");

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
                System.out.println("There's not much to see in your dorm. You should go back to the foyer \n");
                player.startingPoint();

            
                break;
            }


        case "E":
            if (directionInputOne.equals("E") == false) {
                player.eastOne();
            } else {
                System.out.println("There's not much to see in the kitchen. You should go back to the foyer \n");
                player.startingPoint();

            
                break;
            }

        case "W":
            if (directionInputOne.equals("W") == false) {
                player.westOne();
            } else if (potentialDirections.contains("W1")) {
                System.out.println("There's not much to see in this room. You should go back to the foyer \n");
                player.startingPoint();
            }
        


        break;
    }

 

        }
    }




