package person.development.event;

import person.consciousness.Knowledge;

public class Event {

    private String eventType;
    private int eventDuration;
    private Knowledge practicalKnowledge;
    private Knowledge theoreticalKnowledge;

    Event(String _eventType, Knowledge _practicalKnowledge, Knowledge _theoreticalKnowledge) {
        eventType = _eventType;
        practicalKnowledge = _practicalKnowledge;
        theoreticalKnowledge = _theoreticalKnowledge;
    }

    /**
     * @return the eventType
     */
    public String getType() {
        return eventType;
    }

    /**
     * @return the eventDuration
     */
    public int getDuration() {
        return eventDuration;
    }

    /**
     * @return the practicalKnowledge
     */
    public Knowledge getPracticalValue() {
        return practicalKnowledge;
    }

    /**
     * @return the theoreticalKnowledge
     */
    public Knowledge getTheoreticalValue() {
        return theoreticalKnowledge;
    }
}
