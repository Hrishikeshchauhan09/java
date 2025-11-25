package Employee_Abs;

public abstract class Employee {
   String name;
   int id ;
  
  public Employee (int id,  String name){
    this.id = id ;
    this.name = name;
  }

  public abstract calculateSalary();

  public void showDetails(){
    System.out.println("ID:"+ id);
    System.out.println("Name:"+ name);
  }
}
