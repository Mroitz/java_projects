package at.moritz.projects.geometric_figures;

public class circle extends Figure{

    public circle(String name, double length) {
        super(name, length);
    }
    public void getArea(){
        double area = Math.PI * getLength() * getLength();
        System.out.println("The surface area of the circle is: " + area);
    }
}
