package person.development.event;

import person.Student;
import person.consciousness.Knowledge;

public class Event {

    private String eventType;
    private int eventDuration; // days
    private Knowledge practicalKnowledge;
    private Knowledge theoreticalKnowledge;

    Event(String eventType, Knowledge practicalKnowledge, Knowledge theoreticalKnowledge, int eventDuration) {
        this.eventType = eventType;
        this.practicalKnowledge = practicalKnowledge;
        this.theoreticalKnowledge = theoreticalKnowledge;
        this.eventDuration = eventDuration;
    }

    public void applyKnowledge(Student student) {
        // compute the average of theory and practice
        Knowledge totalKnowledge = Knowledge.getAveragedKnowledge(getPracticalValue(), getTheoreticalValue());
        // increase student's knowledge accounting for learning rate
        student.getKnowledge().addKnowledge(student.getLearningRate(), totalKnowledge);
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
