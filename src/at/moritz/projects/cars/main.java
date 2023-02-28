package at.moritz.projects.cars;

public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(200, Engine.TYPE.DIESEL,100);
        Car c1 = new Car(e1,7, "white", "white", "Audi",70);

        c1.fuelamount();
        c1.Break();
        c1.turboBoost();
        c1.honk(1);
        c1.getRemainingRange();
        c1.getHp();
        c1.getEngine().drive(100);
    }
}
