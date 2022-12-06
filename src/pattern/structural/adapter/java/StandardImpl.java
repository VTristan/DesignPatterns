package pattern.structural.adapter.java;

public class StandardImpl implements Standard{
    @Override
    public void operation(double x, double y) {
        System.out.println("--StandardImpl--");
        double sum = x + y;
        System.out.println("operation by addition | result = " + sum);
    }
}
