import java.util.ArrayList;

public class Player {
  ArrayList<String> inventory = new ArrayList<String>(); 
  String name;
  String userHouse;

  
  public Player(String name, int classYear, String house,ArrayList<String> inventory) {
    this.inventory = new ArrayList<String>(); 
    this.name = name;
    this.userHouse = house;
  }

  
}