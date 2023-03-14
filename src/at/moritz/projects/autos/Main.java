package at.moritz.projects.autos;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(300, Engine.TYPE.Gas);
        Producer p1 = new Producer("Ferrari", "Italy", 0.1);
        Car c1 = new Car(e1, "green", 300, 60000, 7, p1, 60000);

        c1.price();
        c1.consumtion();
    }


}
