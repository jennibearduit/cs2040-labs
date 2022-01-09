class Cat implements Comparable<Cat> {
    String name;
    int infectionLevel;
    int index;

    public Cat(String name, int infectionLevel, int index) {
        this.name = name;
        this.infectionLevel = infectionLevel;
        this.index= index;
    }

    public String getName() {
        return name;
    }

    public int getInfectionLevel() {
        return infectionLevel;
    }

    public int getIndex() {
        return index;
    }
    
    @Override
    public int compareTo(Cat c) {
        if (this.infectionLevel == c.infectionLevel) {
            return this.index - c.index;
        } else {
            return c.infectionLevel - this.infectionLevel;
        }
    }
}