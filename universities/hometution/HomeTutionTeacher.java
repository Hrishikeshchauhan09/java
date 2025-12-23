package universities.hometution;

// Different Package, not a Subclass

import universities.school.Student;

public class HomeTutionTeacher {

    public static void main(String[] args){
        Student s = new Student();

        System.out.println(s.rollNo);  // Public
        // System.out.println(s.name);  // protected
        // System.out.println(s.marks);  // X default
        // System.out.println(s.age);  // X private
    }
    
}
