package person;

import person.consciousness.Knowledge;

public class Student {
    public String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
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
}
