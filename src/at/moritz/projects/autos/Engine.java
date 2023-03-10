package at.moritz.projects.autos;

public class Engine {
    public enum TYPE {Diesel, Gas};
    private int horsepower;
    private TYPE type;

    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}
