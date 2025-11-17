import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Koi number enter karo: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;
        
        // Pehle digits count karte hain
        int temp = number;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        
        // Ab Armstrong logic
        temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);  // digit^digits
            temp = temp / 10;
        }
        
        // Check karna
        if (original == sum) {
            System.out.println(original + " - Armstrong number hai! ✅");
        } else {
            System.out.println(original + " - Armstrong number nahi hai! ❌");
        }
        
        scanner.close();
    }
}