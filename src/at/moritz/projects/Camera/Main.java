package at.moritz.projects.Camera;

public class Main {
    public static void main(String[] args) {
        Lens lens = new Lens("Canon", 5000);
        SD_card card = new SD_card(10);

        Camera cam = new Camera(lens,card,4000,500,"black", "Canon","America");

        cam.takePicture();
        System.out.println();
    }
}
