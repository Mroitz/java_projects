package at.moritz.projects.Camera;

public class Camera {
    private Lens lens;
    private SD_card card;
    private int pixel;
    private int weight;
    private String color;
    private Producer producer;
    private Resolution resolution;
    public enum Resolution {small,medium,big};

    public Camera(Lens lens, SD_card card, int pixel, int weight, String color, Producer producer, Resolution resolution) {
        this.lens = lens;
        this.card = card;
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.resolution = resolution;
    }

    public PictureFiles takePicture(){
        PictureFiles Pic = new PictureFiles("firstPic","01.04.2006", resolution);
        this.card.Save(Pic);
        return Pic;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
