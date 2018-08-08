package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import javafx.event.Event;
import person.Student;
import person.consciousness.Knowledge;
import person.development.event.Event;
import person.development.strategy.Strategy;

public class Application {
    public static void main(String[] args) {
        // can be substituted with an API call
        ArrayList<Student> abiturientsList = new ArrayList<Student>();
        abiturientsList.add(new Student("Vladyslav Nesterenko", 1.0));
        abiturientsList.add(new Student("Andrew Kostenko", 0.5));
        abiturientsList.add(new Student("Julia Velkina", 0.25));
        abiturientsList.add(new Student("Maria Perechrest", 0.125));

        ArrayList<Event> events = new ArrayList<>();
        
        events.add(new Event("go to university", new Knowledge(150.0), new Knowledge(10.0), 210));
        events.add(new Event("ask mentor", new Knowledge(2.5), new Knowledge(2.5), 1));
        events.add(new Event("read a tech book", new Knowledge(45.0), new Knowledge(1.0), 7));
        events.add(new Event("take an online tutorial", new Knowledge(10.0), new Knowledge(15.0), 5));
        
        Strategy optStrategy = new Strategy(events);

        Student tStudent = abiturientsList.get(3);
        optStrategy.applyToStudent(tStudent);

        Sytem.out.println(tStudent.getKnowledge().getLevel());
    }
}
