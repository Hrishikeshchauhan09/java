package Employee_Abs;

public class Main {
  public static void main(String[] args) {
    
    Employee e1 = new FullTimeEmployee(1,"Aman", 30000 );
    Employee e2 = new PartTimeEmployee(2,"Raj", 300, 20 );

    System.out.println("Full-Time Employee:");
    e1.showDetails();
    System.out.println("Salary:"+ e1.calculateSalary());

    System.out.println("\nPart-Time ");
  }
  
}
