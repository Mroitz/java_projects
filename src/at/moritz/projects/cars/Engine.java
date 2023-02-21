package at.moritz.projects.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type;

    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("motor is running on" + amount);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}

