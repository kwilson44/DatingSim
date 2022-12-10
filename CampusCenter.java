import java.util.ArrayList;

public class CampusCenter {
  public boolean active = false;
  public String direction;
  public Integer position;

  public CampusCenter(ArrayList<String> inventory, int points) {
    
  }

  public void enter() {
    direction = "entrance";
    position = 0;
  }

  public void goNorth() {
    direction = "n";
    position += 1;
  }
}