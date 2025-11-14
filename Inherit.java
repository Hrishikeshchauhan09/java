class Parent {

  void parentProperty(){
    System.out.println("parent property");
  }

}

class Child extends Parent {

  void ChildProperty() {
    System.out.println("Child Property");
  }

}

class GrandChild extends Child {

  void GrandChildproperty() {
    System.out.println("GrandChild Property");
  }

}

public class Inherit {

  public static void main(String[] args) {
    GrandChild GC = new GrandChild();
    GC.GrandChildproperty();
  }
  
}
