
class StringBufferMethods {
    
   public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Avenger Assemble");

    //1. Length()
    System.out.println("Length: " + sb.length()); // 16

    //2. charAt(index)
    System.out.println("Character at index 3: " + sb.charAt(3)); // 'n'

    //3. append()
    sb.append("Now!");
    System.out.println("After append: " + sb); //"Avenger Assemble Now!"

    // 4. insert()
    sb.insert(0, "Marvel: ");
    System.out.println("After insert: " + sb); // "Marvel: Avenger Assemble Now!"

    // 5. replace(start, end, str)
    sb.replace(8, 15, "Guardians");
    System.out.println("After replace: " + sb); // "Marvel: Guardians Assemble Now!"

    // 6. delete(start, end)
    sb.delete(26, sb.length());
    System.out.println("After delete: " + sb); // "Marvel: Guardians Assemble"

    // 7. reverse()
    sb.reverse();
    System.out.println("After reverse: " + sb); // reversed string
        

   }
}
