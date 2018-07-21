package person.development.strategy;

import person.development.event;
import person.development.event.Event;

import java.util.ArrayList;

import person.Student;
import person.consciousness.Knowledge;

public class Strategy {
    private ArrayList events;

    Strategy(ArrayList _events) {
        events = _events;
    }

    public ArrayList getEvents() {
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
}
