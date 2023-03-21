package at.moritz.projects.Lampe;

public class main {
    public static void main(String[] args) {
        Glühlampe le1 = new Glühlampe("Bert", "Green");
        MainLamp l1 = new MainLamp();
        l1.addLightElement(le1);

        le1.turnOn();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
    }
}
