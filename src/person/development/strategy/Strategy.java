package person.development.strategy;

import person.development.event.Event;

import java.util.ArrayList;

import person.Student;
import person.consciousness.Knowledge;

public class Strategy {
    private ArrayList<Event> events;

    Strategy(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void addEvents(ArrayList<Event> events) {
        events.addAll(events);
    }

    public int getTotalDuration() {
        int totalDuration = 0;

        for (Event event : events) {
            totalDuration += event.getDuration();
        }

        return totalDuration;
    }

    public void applyToStudent(Student student) {
        for (Event event : getEvents()) {
            event.applyKnowledge(student);
        }
    }
}
