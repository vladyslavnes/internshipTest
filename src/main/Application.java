package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

       // can be substituted with an API call
        ArrayList<Student> abiturientsList = new ArrayList<Student>();
        abiturientsList.add(new Student("Vladyslav Nesterenko"));
        abiturientsList.add(new Student("Andrew Kostenko"));
        abiturientsList.add(new Student("Julia Velkina"));
        abiturientsList.add(new Student("Maria Perechrest"));
        
        // System.out.print(abiturientsList.length);
        university.addStudents(abiturientsList);

        ArrayList<Student> students = university.getStudents();
        
        // here goes some logic for rating students
        for (Student student : students) {
            university.rateStudent(student, new Knowledge(5));
        }

        // set a rate lower than the floor level
        university.rateStudent(abiturientsList.get(3), new Knowledge(2));

        // need to specify the internship's name and the floor knowledge level
        Internship internship = new Internship("Interlink", university.getAverageKnowledgeLevel());
        
        // try to set all the students
        for (Student student : students) {
            internship.setStudent(student);
        }
        
        System.out.println("List of internship's students:");
        for (Student student : students) {
            // Voila! The student without the needed doesn't get to the internship
            if (internship.isIntern(student)) {
                System.out.println(student.getName());
            }
        }
        
    }
}
