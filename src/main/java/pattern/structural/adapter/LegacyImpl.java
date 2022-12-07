package pattern.structural.adapter;

public class LegacyImpl {

    public double product(double a, double b) {
        return a * b;
    }

    public void display(double result) {
        System.out.println("LegacyImpl | result = " + result);
    }

}
