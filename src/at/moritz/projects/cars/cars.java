package at.moritz.projects.cars;

public class cars {

    private int fuelconsumption;
    private String serialnumber;
    private String color;
    private String brand;
    private int fuelcapacity;
    private int aktivfuel;
    private int range;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAktivfuel(int aktivfuel) {
        this.aktivfuel = aktivfuel;
    }

    public void setFuelcapacity(int fuelcapacity) {
        this.fuelcapacity = fuelcapacity;
    }

    public void setFuelconsumption(int fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public cars(int fconsumtion, String snumber, String color, String brand, int fcapacity) {
        this.fuelconsumption = fconsumtion;
        this.fuelcapacity = fcapacity;
        this.color = color;
        this.brand = brand;
        this.serialnumber = snumber;
    }

    public void drive() {
        this.aktivfuel = this.fuelcapacity - this.fuelconsumption;
        System.out.println("fuelamount is " + this.aktivfuel + " liters");
    }

    public void Break() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (this.aktivfuel > (0.1 * this.fuelcapacity)) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to SuperBoostMode");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("TUUUT!");
        }
    }

    public void getRemainingRange() {
        range = this.aktivfuel / this.fuelconsumption;
        System.out.println(range + "km");
    }
}
