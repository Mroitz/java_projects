package at.moritz.projects.Camera;

public class Lens {
    private String producer;
    private int brennweite;

    public Lens(String producer, int brennweite) {
        this.producer = producer;
        this.brennweite = brennweite;
    }

    public String getProducer() {
        return producer;
    }

    public int getBrennweite() {
        return brennweite;
    }
}
