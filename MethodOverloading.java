import java.util.Scanner;

public class MethodOverloading {

  public static int square(int num){
     return num * num;
  }

  public static int divide(int a, int b) {
     return a/b;
  }
  
  public static int multiply(int a , int b) {
    return a*b;
  }

  public static int add(int a , int b ){
    return a + b ;
  }

  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("== METHOD OVERLOADING ==");

    System.out.println("\n--SQUARE--");
    System.out.println("Square of 5 (int):"+ square(5));
    
    
    System.out.println("\n--Multily--");
    System.out.println("10*3(int):" + multiply(10, 3));

    
    System.out.println("\n--DIVIDE--");
    System.out.println("10/3 (int):"+ divide(10,3));
  
    
    
    System.out.println("\n--ADD--");
    System.out.println("10+20 (two int):" + add (10, 20));



    // user Input
    System.out.println("\n--User Input--");
    
    System.out.println("Enter number:");
  
    int num1 = scanner.nextInt();  
    System.out.println("Square of"+ num1 + "is:" + square(num1));


    System.out.println("Enter two number");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(a + "*" + b + "=" + multiply(a , b));

    System.out.println(a +"/" + b + "=" + divide(a,b));

    System.out.println(a+"+"+b+"="+ add(a, b));
  
    scanner.close();


  }  
}
