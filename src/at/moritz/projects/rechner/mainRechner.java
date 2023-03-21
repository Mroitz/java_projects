package at.moritz.projects.rechner;

public class mainRechner {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(1,2);
        scienceCalculator cs1 = new scienceCalculator(1,2);
        rootcalculator rc1 = new rootcalculator(4,2);

        c1.addition();
        c1.subtraction();
        c1.multiplication();
        c1.division();

        cs1.sinus();
        cs1.cosinus();

        rc1.root();


    }
}
