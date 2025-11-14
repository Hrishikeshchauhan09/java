import java.util.Scanner;
public class Palindrome {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number");

    int number = scanner.nextInt() ;
    int original = number ;
    int reversed = 0 ;

    while (number > 0) {
      int lastdigit = number % 10;
      reversed = reversed * 10 + lastdigit;
      number = number / 10 ;
    }
      if (original == reversed) {
        System.out.println(original + "-Yes Its Palindrome");
      }
      else{
        System.out.println(original + "-NO Its Not Palindrome");
      }

      scanner.close();
    }
  }
  

