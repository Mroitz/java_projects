package at.moritz.projects.remote;

import java.util.ArrayList;
import java.util.List;

public class remote {
    private List<battery> batteries;
    private int Status;

    public remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(battery battery) {
        this.batteries.add(battery);
    }

    public void getStatus() {
        for (int i = 0; i < 2; i++) {
            Status += this.batteries.get(i).getBatterystate();
        }
        Status = Status / 2;
        System.out.println(Status +"%");
    }

    public void turnOn() {
        for (int i = 0; i < 2; i++) {
            Status = this.batteries.get(i).getBatterystate() - 5;
            System.out.println("Verbraucher " + (i + 1) + " angeschlossen, Akkustand beträgt " + Status +"%");
        }
    }

    public void turnOff() {
            System.out.println("Kein Verbraucher angeschlossen");
        }
}
