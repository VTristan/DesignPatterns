package pattern.structural.adapter;

public class AdapterImplByComposition implements Standard{
    private final LegacyImpl legacy = new LegacyImpl();

    @Override
    public void operation(double x, double y) {
        System.out.println("--AdapterImplByComposition--");
        double result = legacy.product(x, y);
        legacy.display(result);
    }
}