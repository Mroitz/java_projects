package at.moritz.projects.autos;

public class Main {
    Engine e1 = new Engine(300, Engine.TYPE.Gas);
    Producer p1 = new Producer("Ferrari", "Italy", 10);
    Car c1 = new Car(e1,"green", 300, 60000, 7, p1);
}
