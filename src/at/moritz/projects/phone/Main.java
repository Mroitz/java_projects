package at.moritz.projects.phone;
public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM(123, "06606100188");
        SD_Card sdCard = new SD_Card(10000);
        Camera cam = new Camera();

        Phone phone = new Phone(sdCard, sim, cam, "green");
        phone.makeCall("12345");
        phone.takePicture();
        phone.PrintAllFiles();
        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}
