import java.util.Scanner;

public class VowelorConsonent {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        //Convert to lowercase for checking
        ch = Character.toLowerCase(ch);
        if(Character.isLetter(ch)){
            if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch =='o' ||ch =='u'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonent");
            }
        }else{
            System.out.println("Not an alphabet");
        }
        sc.close();
    } 

    
}
