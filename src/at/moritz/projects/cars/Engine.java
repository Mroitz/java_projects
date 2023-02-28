package at.moritz.projects.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type;
    private int speed;

    public Engine(int horsepower, TYPE type, int speed) {
        this.horsepower = horsepower;
        this.type = type;
        this.speed = speed;
    }

    public void drive(int amount){
        System.out.println(speed);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}

