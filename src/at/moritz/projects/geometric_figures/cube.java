package at.moritz.projects.geometric_figures;

public class cube extends Figure{

    public cube(String name, double length) {
        super(name, length);
    }

    public void getArea(){
        double area = 6 * getLength() * getLength();
        System.out.println("The surface area of the cube is: " + area);
    }
}

