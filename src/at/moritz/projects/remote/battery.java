package at.moritz.projects.remote;

public class battery {
    private int Batterystate;

    public battery(int batterystate) {
        Batterystate = batterystate;
    }

    public void setBatterystate(int batterystate) {
        Batterystate = batterystate;
    }

    public int getBatterystate() {
        return Batterystate;
    }
}
