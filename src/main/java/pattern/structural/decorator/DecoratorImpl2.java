package pattern.structural.decorator;

public class DecoratorImpl2 extends AbstractDecorator {

    public DecoratorImpl2(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("--DecoratorImpl2 : before");
        component.operation();
        System.out.println("--DecoratorImpl2 : after");
    }
}