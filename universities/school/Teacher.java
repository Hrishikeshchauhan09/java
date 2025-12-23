package universities.school;

// same package, Different class 

public class Teacher {

    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.rollNo);  // Public
        System.out.println(s.name);  // Protected
        System.out.println(s.marks);  // default
        // System.out.println(s.age);  // x private (ERROR)

        System.out.println("=============== Show Details Method is called ===============");
        s.showDetails();
    } 
    
}
