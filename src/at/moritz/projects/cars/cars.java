package at.moritz.projects.cars;

public class cars {

    public int fuelconsumption;
    public String serialnumber;
    private String color;
    public String brand;
    public int fuelcapacity;
    public int aktivfuel;
    public int range;

    public void drive(){
        this.aktivfuel = this.fuelcapacity - this.fuelconsumption;
        System.out.println("fuelamount is " + this.aktivfuel +" liters");
    }

    public void Break(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if(this.aktivfuel > (0.1 * this.fuelcapacity)) {
            System.out.println("SuperBoostMode");
        }
        else{
            System.out.println("Not enough fuel to go to SuperBoostMode");
        }
    }
    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("TUUUT!");
        }
    }

    public void getRemainingRange(){
        range = this.aktivfuel / this.fuelconsumption;
        System.out.println(range + "km");
    }
}
