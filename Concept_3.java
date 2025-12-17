// Multiple exception handled using multi - catch block

class Concept_3 {
       public static void main(String[] args) {
        
        try {
            int a = 10 / 2;
            //int a = 10 / 0;
            System.out.println("Value of a: "+a);

            int[] arr = new int[2];
            arr[1] = 10;
            // arr[3] = 10;     //ArrayIndexOutOfBoundsException
            System.out.println("Value of Array: "+arr[1]);

            String s = "Avenger";
            // String s=null; // NullPointerException
            System.out.println("Length of String: " +s.length());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured :  "+e);
        } 
            System.out.println("Program continues");
        }
}
