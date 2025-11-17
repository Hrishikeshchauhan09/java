import java.util.Scanner;

public class Reverseofnumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the Number:");
    int number = scanner.nextInt();
    int original = number;
    int reversed = 0;

    while(number > 0) {
      int lastDigit = number % 10;
      reversed = reversed * 10 + lastDigit;
      number = number / 10;
    }

    System.out.println(original + " the reverse is: " + reversed);

    scanner.close();

  }
  
}
