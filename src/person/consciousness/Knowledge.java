package person.consciousness;

public class Knowledge {
    private double level;

    public Knowledge(double level) {
        this.level = level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(double level) {
        this.level = level;
    }

    /**
     * @return the level
     */
    public double getLevel() {
        return level;
    }

    public void addKnowledge(double learningRate, Knowledge newKnowledge) {
        level += newKnowledge.getLevel() * learningRate;
    }

    public static Knowledge getAveragedKnowledge(Knowledge baseKnowledge, Knowledge newKnowledge) {
        // evenly redistribute two knowledges
        double totalKnowledge = (baseKnowledge.getLevel() + newKnowledge.getLevel()) / 2;
        return new Knowledge(totalKnowledge);
    }
}
