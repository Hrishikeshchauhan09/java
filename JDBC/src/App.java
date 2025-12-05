import java.sql.*;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
  static Connection con;
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) throws Exception {
    Connection con = DriverManager.getConnection(
        "JDBC:mysql://localhost:3306/HRISHI",
        "root", 
        "root");

        System.out.println("connection established");
        
        while (true) {
            System.out.println("Welcome to the Avenger Database ");
            System.out.println("1. View Avengers");
            System.out.println("2. Add Avengers");
            System.out.println("3. Update Avengers");
            System.out.println("4. Delete Avengers");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            String choice = sc.nextLine();
            
            switch (choice) {
                case "1": viewAvenger();
                break;

                case "2": addAvenger();
                break;
                
                case "3": updateAvenger();
                break;

                case "4": deleteAvenger();
                break;

                case "5": sc.close();
                

                    
                    break;
            
                default:
                    break;
            }
        }
  }
    
}
