package at.moritz.projects.autos;

public class Car {
    private Engine engine;
    private String Color;
    private int maxspeed;
    private double baseprice;
    private int baseconsumption;
    private Producer producer;

    public Car(Engine engine, String color, int maxspeed, int baseprice, int baseconsumption, Producer producer) {
        this.engine = engine;
        this.Color = color;
        this.maxspeed = maxspeed;
        this.baseprice = baseprice;
        this.baseconsumption = baseconsumption;
        this.producer = producer;
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

    public void setBaseconsumption(int baseconsumption) {
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

    public int getBaseconsumption() {
        return baseconsumption;
    }

    public void price(){
        double price = this.baseprice - this.baseprice * this.producer.getDiscount();
    }
}
