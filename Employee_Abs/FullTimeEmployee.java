package Employee_Abs;

public class FullTimeEmployee extends Employee {

  double basicSalary;

  public FullTimeEmployee(int id, String name, double basicSalary) {
    super(id, name);
    this.basicSalary = basicSalary;
  }

  public double calculateSalary(){
    return basicSalary;
  }
  
}
