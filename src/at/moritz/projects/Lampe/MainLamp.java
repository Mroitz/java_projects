package at.moritz.projects.Lampe;

import remote.battery;

import java.util.ArrayList;
import java.util.List;

public class MainLamp {
    private List<Glühlampe> Glühelemente;
    private double powerUsage;

    public MainLamp() {
        this.Glühelemente =  new ArrayList<>();
    }
    public void addLightElement(Glühlampe glühlampe) {
        this.Glühelemente.add(glühlampe);
    }

    public void turnAllOn(){
        for (int i = 0; i < Glühelemente.size(); i++) {
            this.Glühelemente.get(i).setState(Glühlampe.State.on);
            System.out.println(this.Glühelemente.get(i).getState());
        }
    }

    public double getOverallPowerUsage(){
        for (int i = 0; i < Glühelemente.size(); i++) {
            powerUsage += this.Glühelemente.get(i).getPowercon();
            System.out.println(powerUsage);
        }
        return powerUsage;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < Glühelemente.size(); i++) {
            System.out.println(this.Glühelemente.get(i).getName());
        }
    }
}
