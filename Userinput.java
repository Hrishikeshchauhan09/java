import java.util.Scanner;

  class Userinput {
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //String (whole line)
       System.out.print("Enter your full name: ");
       String fullName = sc.nextLine();

       // String (single word)
       // System.out.print("Enter your nickname: ");
       // String nickname = sc.next();  // stops at space

       // int
       System.out.print("Enter your age: ");
       int age = sc.nextInt();

       //long
       System.out.print("Enter your phone number: ");
       long phone = sc.nextLong();

       //float
       System.out.print("Enter your height in meters(e.g. 1.75):");
       float height = sc.nextFloat();

       //double
       System.out.print("Enter your GPA: ");
       double gpa = sc.nextDouble(); 
        
       //even or odd
       System.out.println("Enter the number:");
       int number = sc.nextInt();
       if (number % 2 == 0){  
         System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
        sc.close();
      }
    }
         
       
        
       


  

