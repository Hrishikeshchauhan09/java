import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;
        
         
        int temp = number;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        
        // logic
        temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);  
            temp = temp / 10;
        }
        
        // Check 
        if (original == sum) {
            System.out.println(original + " yes its Armstrong no.");
        } else {
            System.out.println(original + " No its not Armstrong no.");
        }
        
        scanner.close();
    }
}