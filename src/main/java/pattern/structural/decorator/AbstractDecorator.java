package pattern.structural.decorator;

public abstract class AbstractDecorator implements AbstractComponent {
    AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }
}
