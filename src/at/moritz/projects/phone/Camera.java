package at.moritz.projects.phone;

public class Camera {
    private int resolution;
    public PhoneFile takePicture(){
        PhoneFile file = new PhoneFile(1000, "name1", "jpg");
        return file;
    }
}
