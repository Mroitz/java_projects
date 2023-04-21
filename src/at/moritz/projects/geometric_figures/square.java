package at.moritz.projects.geometric_figures;

public class square extends Figure{
    public square(String name, double length) {
        super(name, length);
    }

    public void getArea(){
        double area = getLength() * getLength();
        System.out.println("The surface area of the squares is: " + area);
    }
}
