import java.util.ArrayList;

public class Player {
  private ArrayList<String> inventory = new ArrayList<String>(); 
  Integer points;
  String name;
  String userHouse;
  
  public Player(String name, int classYear, String house) {
    this.inventory = new ArrayList<String>(); 
    this.points = 0;
    this.name = name;
    this.userHouse = house;
  }
}
