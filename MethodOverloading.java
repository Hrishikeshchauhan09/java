import java.util.Scanner;

public class MethodOverloading {

  public static int square(int num){
     return num * num;
  }

  public static int divide(int a, int b) {
     return a/b;
  }
  
  public static int multiply(int a , int b, int c) {
    return a*b*c;
  }

  public static int add(int a , int b , int c){
    return a + b + c;
  }

  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("== METHOD OVERLOADING ==");

    System.out.println("\n--SQUARE--");
    System.out.println("Square of 5 (int):"+ square(5));
    
    
    
    System.out.println("\n--DIVIDE--");
    System.out.println("10/3 (int):"+ divide(10,3));
  }


  System.out.println
}
