package pattern.structural.decorator;

public class ComponentImpl implements AbstractComponent {
    @Override
    public void operation() {
        System.out.println("--ComponentImpl : processing...");
    }
}
