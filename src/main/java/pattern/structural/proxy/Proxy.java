package pattern.structural.proxy;

import java.util.Random;

public class Proxy implements Standard {
    private StandardImpl1 target;

    @Override
    public void process() {
        System.out.println("Proxy : check authorization");

        boolean isPermit = new Random().nextBoolean();

        if (isPermit) {
            System.out.println("Proxy : before");
            /* Nous chargeons l'objet qu'à cette condition */
            target = new StandardImpl1();
            target.process();
            System.out.println("Proxy : after");
        } else {
            throw new RuntimeException("Proxy : 403 : Forbidden");
        }
    }
}
