package pattern.structural.decorator;

public class DecoratorImpl extends AbstractDecorator {

    public DecoratorImpl(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("--DecoratorImpl : before");
        component.operation();
        System.out.println("--DecoratorImpl : after");
    }
}