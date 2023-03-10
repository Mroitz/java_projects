package at.moritz.projects.cars;

public class Wheels {
    private String Type;
    private int Size;
    private String position;

    public Wheels(String type, int size, String position) {
        Type = type;
        Size = size;
        this.position = position;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setSize(int size) {
        Size = size;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}