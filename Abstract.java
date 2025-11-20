abstract class Avenger{
  String name;

  void introduce(String name){

  }

  abstract void attack();
}

class Thor extends Avenger{
  void intro(){
    System.out.println("I am Thor");
  }

  void attack(){
    System.out.println("atacking");
  }
}

class Iron extends Thor{
  void attack(){
    System.out.println("Iron man");
  }
}

public class Abstract {

  public static void main(String[] args) {
    
  }
}
