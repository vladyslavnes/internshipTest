package institution.interlink;

import java.util.ArrayList;

import person.Student;

public class Internship {
    public String name;
    public int floorLevel;
    private ArrayList<Student> students = new ArrayList<>();

    public Internship(String name, int floorLevel) {
        this.floorLevel = floorLevel;
        this.name = name;
    }

    public void setStudent(Student student) {
        // if knowledge of student meets the reqiurements
        if (student.getKnowledge().getLevel() >= floorLevel) {
            // add to students
            students.add(student);
        }
    }

    public Boolean isIntern(Student student) {
        return getStudents().contains(student);
    }

    public ArrayList getStudents() {
        return students;
    }
}
