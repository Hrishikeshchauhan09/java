public class Switch {

  public static void main(String[] args) {
    
     // Switch statement for fruit
     System.out.println("Switch statement:");
     String fruit = "apple";
    
     switch (fruit) {
      case "banana":
      System.out.println("Banana is yellow.");
      break;
     case "apple":
      System.out.println("Apple is red.");
      break;
     case "organge":
      System.out.println("Orange is orange.");
      break;
      default:
          System.out.println("I don't know the color of this fruit.");
     }

     System.out.println("\n----------------------------");
  }
  
}
