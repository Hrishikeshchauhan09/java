import java.io.FileReader;
import java.io.FileNotFoundException;

public class ThrowsConcept_7 {

    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("exception\\fil.txt");
        System.out.println("File opened Successfully.");
    }
    // static void readFile() {
    //     try{
    //         FileReader fr = new FileReader("exception\\fil.txt");
    //         System.out.println("File opened successfully.");
    //     }
    //     catch(FileNotFoundException e){
    //         System.out.println("File not found: ");
    //     }
    // }
    
    public static void main(String[] args) {
        try{
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        }

        // readFile();   // throws FileNotFoundException we have to add in main method
    }
}
