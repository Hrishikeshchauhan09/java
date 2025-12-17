class Concept_2 {

    public static void main(String[] args) {
        
        try {
            int a = 10 / 2;
            //int a = 10 / 0;
            System.out.println("Value of a: "+a);

            int[] arr = new int[2];
            arr[1] = 10;
            // arr[3] = 10;
            System.out.println("Value of Array: "+arr[1]);

            String s = "Avenger";
            // String s=null;
            System.out.println("Length of String: " +s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception ");
        }catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
    
}
