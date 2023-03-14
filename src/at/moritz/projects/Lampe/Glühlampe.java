package at.moritz.projects.Lampe;

public class Glühlampe {
    private String name;
    private String color;
    private int powercon;
    public enum State {on,off}
    private State state;

    public Glühlampe(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPowercon() {
        return powercon;
    }

    public State getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPowercon(int powercon) {
        this.powercon = powercon;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn(){
        if (this.state == State.on){
            System.out.println("Mein Name ist" + this.name +  ". Ich bin bereits eingeschaltet");
        }
        else {
            powercon += 5;
        }
    }
}
