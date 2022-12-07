import java.util.Scanner;
import java.util.ArrayList;


/* This is a stub for the House class ADD playerintro EXTENDS??*/
public class House {
    int points = 0;
    boolean active = false;
    String direction;
    int position;

// Directions and S for starting point
    String potentialDirections[]= {"N1","N2","E1","E2","S1","S2","W1","W2","SP"};
//figure out how to extend
    ArrayList<String> inventory = new ArrayList<String>();
    Scanner myObj = new Scanner(System.in);

    public int HouseIntro(int points) {

        direction = potentialDirections[8];
        this.points = points;

        System.out.println("-INSERT NAME-walks in to -INSERT HOUSE- 'Wowza!' You say in disbelief as you walk around and look at your potential home for the next 4 years. There's a wide array of Smithies buzzing and getting ready for classes. All of a sudden, your phone rings with an email notification. Do you read it? (Y/N) \n");

        String emailYN = myObj.nextLine();

        if (emailYN.equals("Y")) {
            System.out.println("Nice! It always good to read your emails :D. It states: Hey *characterization[0]*, it's me, Sophia Smith again, I just wanted to tell you you can explore Smith's Campus by going N, E, S, W, there are limitations of course but you should look around, you could meet someone you fancy. You can also add things you find to your inventory by typing 'add' and the object you want. Also, you can impress your crush by talking with them or giving gifts you find. One last thing, while you can have multiple crushes, choosing one main one might make winning them over easier :D Okay, good luck kid *** +10 POINTS *** \n");
            points += 10;
        } else if (emailYN.equals("N")) {
            System.out.println("Well, alright dumbass, that might have been important but, I guess you don't care... Good luck figuring out how to move and do stuff you dumb piece of sh-- okay, okay, I think I might be too mean but I guess this is an important lesson: your choices matter. *** -10 POINTS *** \n");
            //IDK about the math for that
            points-=-10;
        } else {
            System.out.println("Okay, looks like someone can't follow directions. I get it, you're free spirited, I like that. Just explore around campus and collect stuff. Try to find someone that can tolerate your pressence. You can go N,S,E,W. Good luck! (You're gonna need it).  *** -5 POINTS *** \n");
            //IDK about the math for that
            points-=-5;
        }
        System.out.println("With that, it's time for adventure... and love??? A bit overwhemled, you look at everything that beholds you. To the east (E) you can smell some ramen and hear a Smithie bitterly complaining about the food at Smith and further east the thudding of washing machines. To the west (W) you can see and lounging area and Smithies Studying. South (S) of you is the exit and North (N) is the staircase that leds to your room. Where do you go?(Type N,E,S,or W) \n");
        //directionInputOne = myObj.nextLine();
        return points;
    }



    public void northOne () {
        points+=1;
        active = true;
        direction = potentialDirections[0];

        System.out.println("You walk upstairs and head into your dorm. There to meet you is your roommate(There's a 50/50 chance things will go well).*** +1 POINT *** \n");

        boolean roommateFriendship;
        int roommateFriend = (int)(Math.random()*(2-1+1)+1);

        if (roommateFriend%2 ==1) {
            System.out.println("Your roommate smiles when you enter the room. Yay! *** +10 POINTS *** \n");
            roommateFriendship  = true;
            points+=10;
        } else {
            System.out.println("Your roommate glares at you and seems to be mad you're breathing so loudly. *** -10 POINTS ***\n");
            roommateFriendship  = false;
            points-=10;
        }

        if (roommateFriendship == true) {
            System.out.println("Hey *characterization[0]*, it's nice to finally meet you in person. I'm Jess, but everyone calls me Jelly.  *Jelly goes back to unpacking* :D \n");
        }


        if (roommateFriendship == false) {
            System.out.println(" 'Oh, hi *characterization[0]*. I guess you want to be in my room... that's cool I guess, I'm Jess' *blasts loud music you don't like and starts smoking weed (and doesn't even offer to share!) :( * \n");

        }

        System.out.println("You notice a -Smith Cookie- on your roommate's desk. You kind of want it. 'Hey roomie' you say, half smiling, 'Can I have that cookie?'\n ");

        if (roommateFriendship == true) {
            System.out.println("'Sure! I wasn't even going to eat it anyway'\n Cool! Now it's in your nice Conaway Center Tote Bag. *** +5 POINTS *** \n");

            inventory.add("Smith Cookie");
            points+= 5;
        }

        if (roommateFriendship == false) {
            System.out.println("'HELL NO, its for Mr.Twinkles' *Jess proceeds to feed the cookie to her unregistered, feral, emotional support rat that lives on your dresser* \n");

        }

        System.out.println("Well, that was fun. *UwU*, I think that's all I can do here. Should I go further into my dorm more north or go back downstairs?(N/S) \n");
    }

    public void northTwo () {

        points+=1;
        active = true;
        direction = potentialDirections[1];

        System.out.println("*** +1 POINT *** You walk further into your dorm and start unpacking. On your desk you see an old photo of Smithies from the 1800s doing a play. One Smithie is dressed in a gown and another is as a monster. That's werid... Should you take it? (Y/N) \n");
        String deskYN = myObj.nextLine();


        if (deskYN.equals("Y")) {

            inventory.add("old picture");
            points+=5;
            System.out.println("Cool! Now it's in your nice Conaway Center Tote Bag. *** +5 POINTS *** \n");

        } else if (deskYN.equals("N")) {
            System.out.println("Whelp, I'm sure that won't have far reaching consequences. It's just a dumb old picture anyway. \n");
        }

    }

    public void eastOne () {

        points+=1;
        active = true;
        direction = potentialDirections[2];

        System.out.println("You enter the kitchette and see two Smithies making Peanut Butter Cookies and vibing 'Oh golly' you think to yourself 'I better introduce myself a make some friends' What do you open with? \n **Bust it down (type 'B')** \n **Just introduce yourself (type 'I')** \n **Make Fun of your rival house (type M)** \n");
        String eastActionInput = myObj.nextLine();

        if (eastActionInput.equals("B")) {
            System.out.println("Quirked up you goated with the sause busts it down platonic style and impress them with your sweet moves! *** +15 POINTS *** \n");
            points+=15;
        } else if (eastActionInput.equals("I")) {
            System.out.println("You say 'Hi, my name is -INSERT NAME-' and I live in room 302. It's nice to meet you'. That was kind of basic but they seem to like you. *** +5 POINTS *** \n");
            points+=5;
        } else if (eastActionInput.equals("M")) {
            System.out.println("You start trash talking your rivial house that's basically a clone of your house and gain their respect. Nothing builds camaraderie more than a common enemy. *** +10 POINTS *** \n");
            points+=10;
        } else {
            System.out.println("OH NO! You fail to say anything and now they're really uncomfortable as you stare blankly at them. *** -10 POINTS *** \n");
            points-=10;

        }
        if (eastActionInput.equals("B") || (eastActionInput.equals("M"))) {
            System.out.println("One of them stops baking and comes closer to you. 'Eh kid' they say in a Brooklyn esqe accent 'I like your style. I found this -Cat Keychain- in the free bin. It's kind of shiny and cringy, like you. Do you want it? (Y/N)' \n");
            String eastActionInputTwo = myObj.nextLine();

            if (eastActionInputTwo.equals("Y")) {
                inventory.add("Cat Keychain");
                points+=5;
                System.out.println("Cool! Now it's in your nice Conaway Center Tote Bag. *** +5 POINTS *** \n");
            } else {
                System.out.println("Alright kid, keep it moving then. \n");
            }

        }
    }

    public void eastTwo () {
        points+=1;
        active = true;
        direction = potentialDirections[2];
        System.out.println("You go further east and end up in the laundry room. There isn't much to see besides washing machines going and a free bin. 'hmmmm' you wonder to yourself 'there's not much to do' Do you wanna look around? (Y/N)  \n");
        String eastActionInputThree = myObj.nextLine();

    }

      public void startingPoint () {
      System.out.println("You're back in the -INSERT HOUSE- entrance. Where do you wanna go? To your dorm? (N) \n To the kitchenette? (E) \n Outside? (S) \n or the lounging area (W) \n");
      }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        House player = new House();
        player.HouseIntro(0);
        //first n,e,s,w choice
       String directionInputOne = myObj.nextLine();
       String directionInputTwo;

       if (directionInputOne.equals("N")) {
           player.northOne();
            directionInputTwo = myObj.nextLine();
          if (directionInputOne.equals("N") && directionInputTwo.equals("N")){
            player.northTwo();

      } else if (directionInputTwo.equals("S")){
            player.startingPoint();
            directionInputOne = myObj.nextLine();
      }
       }

      

        //player.eastOne();
        //player.eastTwo();
        // player.southOne();
        // player.southTwo();
        // player.westOne();
        //  player.westTwo();
    }

}

//to run the code type javac House.java, ls,  java House
//secret ending minatour