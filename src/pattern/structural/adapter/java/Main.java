package pattern.structural.adapter.java;

public class Main {
    public static void main(String[] args) {
        /* L'Interface du Client (Standard.java) décrit un contrat que les autres classes doivent suivre pour être en mesure de collaborer avec le code client */

        /* La classe Client.java est la classe qui contient la logique métier */
        Client client1 = new Client();

        /* StandardImpl est une première implémentation attendue par le client */
        client1.setStandard(new StandardImpl());
        client1.processing(2,3);

        /* Si nous souhaitons utiliser une autre implémentation, (LegacyImpl.java), sans toucher au code */

        /* A/ Nous pouvons passer par un Adapter qui utilise la composition: */
        Client client2 = new Client();
        client2.setStandard(new AdapterImplByComposition());
        client2.processing(2,3);

        /* B/ Nous pouvons passer par un Adpater qui utilise l'héritage: */
        Client client3 = new Client();
        client3.setStandard(new AdapterImplByInheritance());
        client3.processing(2,3);
    }
}