
import java.util.ArrayList;


//note, figure out how to extend this info. maybe make it a method and put
//it in playerintro
public class Crush{
  
  String [] crushName = {"Bobo (the clown)", "Amie","Bicheal (Bike for short)","Freddi","Gertrude","Mary","Jamba Jess","Elena","Portabella","Java"};

   String [] pronouns = {"she/her","he/him","they/them"};

String [] postiveTraits = {"Bikes/Skateboard","friends with Katie and Erin","Pre-Med","Have a cat","Cool taste in music","Gamer","Reader","From NYC or Cali","Swag","Likes nature"};
  
    String [] negativeTraits = {"quirky","an empath","Smith College Liberal","Aries","STEM Major","Art Major","Confesh User","From Oklahoma","Cringe","The Imposter"};

  String [] style = {"goth", "utilitarian", "dark academia", "dad clothes", "cottagecore", "high femme", "clown", "school spirit", "soccer player", "gamer girl"};

  
  
      ArrayList<String> looks = new ArrayList<String>();
      Integer [] class_year= {2026,2025,2024,2023};

 String [] houseOptions = {"COMSTOCK HOUSE", "HAVEN/WESLEY", "GARDINER HOUSE", "MORROW HOUSE", "SESSIONS COMPLEX", "WILDER HOUSE", "WILSON HOUSE","ALBRIGHT HOUSE","BALDWIN HOUSE","CHAPIN HOUSE", "DUCKETT HOUSE","HUBBARD HOUSE","LAWRENCE HOUSE","MORRIS HOUSE","TYLER HOUSE", "WASHBURN HOUSE", "CAPEN HOUSE","CUTTER HOUSE","GILLETT HOUSE","LAMONT HOUSE","NORTHROP HOUSE", "TALBOT HOUSE","ZISKIND HOUSE","CUSHING HOUSE","EMERSON HOUSE","FRIEDMAN APARTMENTS","JORDAN HOUSE","KING HOUSE","PARK HOUSE","PARSONS HOUSE","SCALES HOUSE","CHASE HOUSE","HOPKINS HOUSE","PARK ANNEX","PARSONS ANNEX","TENNEY HOUSE"};

  //we can change the numbers later if needed
  int crushPoints = (int)(Math.random()*(((420-69)-0)+1))+0;
   int index = (int)(Math.random()*(((houseOptions.length-1)-0)+1))+0;
  String crushHouse = houseOptions[index];
}