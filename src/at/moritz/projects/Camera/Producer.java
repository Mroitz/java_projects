package at.moritz.projects.Camera;

public class Producer {
    private String Producer;
    private String Land;

    public Producer(String producer, String land) {
        Producer = producer;
        Land = land;
    }

    public String getProducer() {
        return Producer;
    }

    public String getLand() {
        return Land;
    }
}
