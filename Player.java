import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;

public class Player {
  private ArrayList<String> inventory = new ArrayList<String>(); 
  Integer points;
  
  public Player(String name, int classYear, String House) {
    this.inventory = new ArrayList<String>(); 
    this.points = 0;
  }
}