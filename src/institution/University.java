package institution;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudents(ArrayList<Student> newStudents) {
		students.addAll(newStudents);
    }

    /**
     * @param studentName the student name to rate
     * @param knowledge the knowledge to set
     */
    public void rateStudent(Student person, Knowledge knowledge) {
        // if the person is a student
        if (isStudent(person) != null) {
            //  set knowledge
            person.setKnowledge(knowledge);
        } else { // don't
            System.out.print("This person is not in the university");
        }
    }

    public Student isStudent(Student person) {
        for (Student student : students) {
            if (person == student) {
                return student;
            }
        }

        return null;
    }

    /**
     * @param student the wanted student
     * @return the knowledge of a certain student
     */
    public Knowledge getKnowledge(Student student) {
        return student.getKnowledge();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
