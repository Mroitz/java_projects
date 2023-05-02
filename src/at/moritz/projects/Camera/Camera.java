package at.moritz.projects.Camera;

public class Camera {
    private Lens lens;
    private SD_card card;
    private int pixel;
    private int weight;
    private String color;
    private String producerName;
    private String producerLand;

    public Camera(Lens lens, SD_card card, int pixel, int weight, String color, String producerName, String producerLand) {
        this.lens = lens;
        this.card = card;
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producerName = producerName;
        this.producerLand = producerLand;
    }

    public PictureFiles takePicture(){
        PictureFiles Pic = new PictureFiles("firstPic","01.04.2006", PictureFiles.Size.small);
        return Pic;
    }
}
