package at.moritz.projects.rechner;

public class rootcalculator extends Calculator{
    private double result;
    public rootcalculator(double a, double b) {
        super(a, b);
    }

    public void root(){
        System.out.println(Math.sqrt(getA()));
    }
}
