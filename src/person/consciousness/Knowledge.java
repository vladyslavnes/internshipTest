package person.consciousness;

public class Knowledge {
	private int level;

    public Knowledge(int level) {
        this.level = level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        if (level > 0 && level < 6) {
            System.out.println("You must set the knowledge level within the range 1-5");
        } else {
            this.level = level;
        }

    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }
}
