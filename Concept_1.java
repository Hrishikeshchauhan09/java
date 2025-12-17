//  Simple try catch block


class Concept_1 {

    public static void main(String[] args) {
        try {
            System.out.println("Before Division");
            // int a = 10/2;
            int a = 10 / 0;               // As Exceptions occured
            System.out.println("After Division");

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
            // System.out.println(e);     // Provide the output

        }

        System.out.println("Program Continues");
    }
    


}
