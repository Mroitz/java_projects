package at.moritz.projects.autos;

public class Car {
    private Engine engine;
    private String Color;
    private int maxspeed;
    private double baseprice;
    private double baseconsumption;
    private Producer producer;
    private int mileage;
    private double consumtion;

    public Car(Engine engine, String color, int maxspeed, int baseprice, double baseconsumption, Producer producer, int mileage) {
        this.engine = engine;
        this.Color = color;
        this.maxspeed = maxspeed;
        this.baseprice = baseprice;
        this.baseconsumption = baseconsumption;
        this.producer = producer;
        this.mileage = mileage;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setBaseprice(int baseprice) {
        this.baseprice = baseprice;
    }

    public void setBaseconsumption(double baseconsumption) {
        this.baseconsumption = baseconsumption;
    }

    public String getColor() {
        return Color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public double getBaseconsumption() {
        return baseconsumption;
    }

    public void price(){
        double price = this.baseprice - this.baseprice * this.producer.getDiscount();
        System.out.println(price+"€");
    }

    public void consumtion(){
        if(this.mileage <= 50000){
            this.consumtion = baseconsumption;
        }
        else{
            this.consumtion = this.baseconsumption + this.baseconsumption * 0.098;
        }

        System.out.println(consumtion);
    }
}
