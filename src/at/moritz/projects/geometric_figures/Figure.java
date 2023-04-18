package at.moritz.projects.geometric_figures;

public class Figure {
    private String name;
    private double length;

    public Figure(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public void getName(){
        System.out.println(name);
    }
}
