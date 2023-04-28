package at.moritz.projects.phone;

import javax.xml.namespace.QName;

public class Phone {
    private SD_Card card;
    private SIM sim;
    private Camera camera;
    private String color;


    public Phone(SD_Card card, SIM sim, Camera camera, String color) {
        this.card = card;
        this.sim = sim;
        this.camera = camera;
        this.color = color;
    }

    public void makeCall(String number){
        this.sim.doCall(number);
    }

    public void takePicture(){
        PhoneFile file = this.camera.takePicture();
        this.card.save(file);
    }

    public void PrintAllFiles(){


    }


}
