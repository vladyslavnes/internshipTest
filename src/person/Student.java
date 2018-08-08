package person;

import person.consciousness.Knowledge;

public class Student {
    public String name;
    private Knowledge knowledge;
    private double learningRate;

    public Student(String name, double learningRate) {
        this.name = name;
        this.learningRate = learningRate;
    }

    /**
     * @return the learningRate
     */
    public double getLearningRate() {
        return learningRate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param knowledge the knowledge to set
     */
    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    /**
     * @return the knowledge
     */
    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void shareKnowledge(Student fellowStudent) {
        // share experiences with another student
        fellowStudent.setKnowledge(Knowledge.getAveragedKnowledge(getKnowledge(), fellowStudent.getKnowledge()));
    }
}
