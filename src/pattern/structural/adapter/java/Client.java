package pattern.structural.adapter.java;

public class Client {
    private Standard standard;

    public void processing(double x, double y) {
        standard.operation(x, y);
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
