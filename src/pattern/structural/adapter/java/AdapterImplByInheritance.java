package pattern.structural.adapter.java;

public class AdapterImplByInheritance extends LegacyImpl implements Standard  {

    @Override
    public void operation(double x, double y) {
        System.out.println("--AdapterImplByInheritance--");
        double result = product(x, y);
        display(result);
    }
}