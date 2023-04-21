package at.moritz.projects.geometric_figures;

public class rectangle extends Figure{

    double width;

    public rectangle(String name, double length, double width) {
        super(name, length);
        this.width = width;
    }

    public void getArea(){
        double area = getLength() * this.width;
        System.out.println("The surface area of the rectangle is: " + area);
    }
}
