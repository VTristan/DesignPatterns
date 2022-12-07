package pattern.structural.decorator;

public class Main {

    public static void main(String[] args) {
        AbstractComponent component;
        /* Nous créons un objet ComponentImpl qui implémente l'interface AbstractComponent */
        component = new ComponentImpl();
        /* Puis nous appelons sa méthode operation() */
        component.operation();

        System.out.print("----------");
        /* Imaginons que nous souhaitons ajouter un nouveau traitement avant et après l'appel de la méthode operation(),
        dans ce cas, nous pouvons créer un décorateur */
        System.out.println("----------");

        /* Le Decorator n°1 va se charger d'ajouter les traitements avant/après,
        pour cela nous devons affecter à la variable 'component' l'objet DecoratorImpl qui prend en paramètre cette même variable */
        component = new DecoratorImpl(component);
        /* Il faut continuer à appeler les méthodes déclarées dans l'interface AbstractComponent */
        component.operation();

        System.out.print("----------");
        /* Nous pouvons créer autant de décorateur que voulu */
        System.out.println("----------");

        /* Decorator n°2 */
        component = new DecoratorImpl2(component);
        component.operation();
    }
}