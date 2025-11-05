class Avenger{

 String f_name = "Steve Roger";   //instance variable 
 static int age = 110;

  static void mission() {
     System.out.println("Mission started....");
    //  System.out.println("first name is " + f_name);
    System.out.println("Age is is "+ age);
  }
}

public class Shield2 {

  public static void main(String[] args) {
       Avenger aven = new Avenger();
       Avenger aven1 = new Avenger();
       Avenger aven2 = new Avenger();

       // Avengers.age = 120;
       Avenger.age = 150;

       System.out.println("Age is is "+ aven.age);
       System.out.println("Age is is "+ aven1.age);
       System.out.println("Age is is "+ Avenger.age);

       Avenger.mission();
      //  Shield2 s = new Shield2();
      //  s.rocket();
      rocket();
  }
  static void rocket() {
    System.out.println("Launching Rocket in galaxy:");
  }
  
}
