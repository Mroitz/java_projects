package remote;

import jdk.jshell.Snippet;

public class main {
    public static void main(String[] args) {
        remote r1 = new remote();
        battery b1 = new battery(100);
        battery b2 = new battery(100);

        r1.addBattery(b1);
        r1.addBattery(b2);

        r1.getStatus();
        r1.turnOn();
        r1.turnOff();

    }
}
