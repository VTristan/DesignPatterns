package pattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        /* Nous pouvons faire un appel directement à l'implémentation de l'interface Standard */
        client.setStandard(new StandardImpl1());
        /* L'appel à la méthode 'process' est exécuté sans la moindre vérification */
        client.process();

        System.out.print("----");
        /* Imaginons que nous souhaitons vérifier si l'utilisateur possède les droits pour consulter une ressource */
        System.out.println("----");

        /* Nous modifions la valeur de l'objet Standard contenu dans l'objet Client */
        client.setStandard(new Proxy());
        /* L'objet Proxy implémente la classe StandardImpl1, seulement elle procède à quelques vérifications avant/après */
        client.process();
    }
}