import java.util.Scanner;

public class Sumofdigits {
  public static void main(String[] args){
    Scanner(System.in);

    System.out.println("Enter the number:");
    int number = scanner.nextInt();
    int original = number;
    int sum = 0;
    
    while (number > 0){
      int lastDigit = number % 10;
      sum = sum + lastDigit;
      number = number / 10;
    }

    System.out.println(original +"The sum of digit:"+ sum);

    scanner.close();
  }
}