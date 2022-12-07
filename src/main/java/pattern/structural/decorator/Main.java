package pattern.structural.decorator;

public class Main {

    public static void main(String[] args) {
        AbstractComponent component = new ComponentImpl();
        component.operation();

        System.out.println("----------");
        //Decorator 1
        component = new DecoratorImpl(component);
        component.operation();
        System.out.println("----------");

        //Decorator 2
        component = new DecoratorImpl2(component);
        component.operation();
    }

}
