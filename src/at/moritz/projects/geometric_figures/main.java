package at.moritz.projects.geometric_figures;

public class main {
    public static void main(String[] args) {
        cube c1 = new cube("Würfel",5);
        rectangle r1 = new rectangle("Viereck",5,4);
        square s1 = new square("Square",8);
        circle cr1 = new circle("Kreis",5);

        c1.getArea();
        r1.getArea();
        s1.getArea();
        cr1.getArea();


    }
}
