 class Avenger {

  String name;
  int age;
  double power;
  // constructor
  Avenger() {
       System.out.println("Avenger custructor is called");
  }
  Avenger(String name){
    System.out.println("name of Avenger in constuctor is:"+name);
  }
  Avenger(int age,double power){
    System.out.println("Age of avenger is:"+age);
    System.out.println("Power of Avengers is:"+power);
  }
  void display(){
    System.out.println("This method is called without parameter");
  }
  void display(String name){
    System.out.println("Name of avenger is:"+name);
  }
  void display(int age, double power){
    System.out.println("Age of avenger is:"+age);
    System.out.println("Power of Avenger is:"+power);
  }
}

public class Shield4 {

  public static void main(String[] args) {

    //Avenger a = new Avenger();
    //Avenger a1 = new Avenger("Tony Stark");
    Avenger a2 = new Avenger(60,12000);
    //a.display();
    //a.display("Steve Roger");
    //a.display(100,20000);
    
  }
}
