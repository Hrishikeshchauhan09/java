package universities.hometution;

// Different Package + subclass

import universities.school.Student;

public class HomeTutionStudent extends Student {

    public static void main(String[] args) {
        
        HomeTutionStudent h = new HomeTutionStudent();

        System.out.println(h.rollNo); // Public
        System.out.println(h.name); // Protected (inheritance)
        // System.out.println(h.marks); // X default
        // System.out.println(h.age); // X private
    }
    
}
