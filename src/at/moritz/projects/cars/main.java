package at.moritz.projects.cars;

public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(200, Engine.TYPE.DIESEL,100);
        Wheels w1 = new Wheels("Winterreifen", 21, "linkshinten");
        Wheels w2 = new Wheels("Winterreifen", 21, "rechtshinten");
        Wheels w3 = new Wheels("Winterreifen", 21, "vornerechts");
        Wheels w4 = new Wheels("Winterreifen", 21, "vornelinks");
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);
        Car c1 = new Car(e1,7, "white", "white", "Audi",70);

        c1.addMirror(r1);
        c1.addMirror(r2);

        c1.fuelamount();
        c1.Break();
        c1.turboBoost();
        c1.honk(1);
        c1.getRemainingRange();
        c1.getHp();
        c1.getEngine().drive(100);
    }
}
