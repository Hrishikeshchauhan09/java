package Superkeyword;
class A{
  // A(int x){
  //   System.out.println("AAA constructor is called and value is" + x);
  // }
  // String color = "Black";
  void show(){
    System.out.println("A class is called");
  }
}
class B extends A{
  // String color = "White";

  // B(){
  //   super(100);
  //   System.out.println("BBB constructor is called ");
  //   System.out.println("Color is"+ color);
  //   System.out.println("Color is"+ super.color);
  // }
void show(){
  super.show();
  System.out.println("B class is called");
}
}
public class Super1 {
 
  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}
