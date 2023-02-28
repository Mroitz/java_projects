package at.moritz.projects.cars;

public class Car {
    private Engine engine;
    private int fuelconsumption;
    private String serialnumber;
    private String color;
    private String brand;
    private int fuelcapacity;
    private int aktivfuel;
    private int range;

    public Car(Engine engine, int fconsumtion, String snumber, String color, String brand, int fcapacity) {
        this.engine = engine;
        this.fuelconsumption = fconsumtion;
        this.fuelcapacity = fcapacity;
        this.color = color;
        this.brand = brand;
        this.serialnumber = snumber;
    }

    public void fuelamount() {
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

    public void getHp() {
        System.out.println(getEngine().getHorsepower() + "hp");
    }


    public void getRemainingRange() {
        range = this.aktivfuel / this.fuelconsumption;
        System.out.println(range + "km");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(int fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFuelcapacity() {
        return fuelcapacity;
    }

    public void setFuelcapacity(int fuelcapacity) {
        this.fuelcapacity = fuelcapacity;
    }

    public int getAktivfuel() {
        return aktivfuel;
    }

    public void setAktivfuel(int aktivfuel) {
        this.aktivfuel = aktivfuel;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
