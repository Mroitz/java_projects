package at.moritz.projects.cars;

public class main {
    public static void main(String[] args) {
        cars c1 = new cars(7, "123A", "white", "Audi", 70);
        c1.setFuelconsumption(7);
        c1.setBrand("Audi");
        c1.setSerialnumber("A1234");
        c1.setFuelcapacity(70);

        c1.drive();
        c1.Break();
        c1.turboBoost();
        c1.honk(1);
        c1.getRemainingRange();
    }
}
