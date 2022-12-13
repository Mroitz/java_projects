package at.moritz.projects.cars;

public class main {
    public static void main(String[] args) {
        cars c1 = new cars();
        c1.fuelconsumption = 7;
        c1.brand = "audi";
        c1.serialnumber = "A1234";
        c1.fuelcapacity = 70;

        c1.drive();

        cars c2 = new cars();
        c2.fuelconsumption = 11;
        c2.brand = "Ford";
        c2.serialnumber = "A1234";
        c2.fuelcapacity = 100;

        c1.Break();
        c1.turboBoost();

        c1.honk(1);

        c1.getRemainingRange();
    }
}
