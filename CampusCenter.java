public class CampusCenter {
  public boolean active = false;
  public String direction;
  public Integer position;

  public CampusCenter() {
    
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