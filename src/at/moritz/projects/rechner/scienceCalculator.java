package at.moritz.projects.rechner;

public class scienceCalculator extends Calculator{
    private double result;
    public scienceCalculator(double a, double b) {
        super(a, b);
    }
    public void sinus(){
        result = Math.sin(getA());
        System.out.println(result);
    }
    public void cosinus(){
        result = Math.cos(getA());
        System.out.println(result);
    }
}
