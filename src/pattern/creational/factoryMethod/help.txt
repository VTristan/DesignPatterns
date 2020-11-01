##############Factory Method##############

##############Définition##############
##############
Définit une interface pour la création d'un objet, mais en laissant à des sous-classes le choix des classes à instancer.
Permet à une classe de déléguer l'instanciation à des sous-classes.

Exemple: Nous avons une interface "Voiture" qui possède plusieurs implémentations : Peugeot, Renault, ...
##############

##############Explications:##############

##############
Nous avons une interface "Voiture".
Elle ne possède qu'une seul méthode: getDescription, qui retourne un String.
##############

##############
Deux classes implémentent cette interface.
-Peugeot et -Renault.
Elles implémentent la méthode getDescription qui retourne la description de la voiture...
Pour être simple, nous afficherons la marque de la voiture.
La marque est propre à la classe, et non pas à l'objet!
La variable est donc static.
De plus elle ne compte pas évoluer!
La variable est donc finale.
##############

##############
Nous avons une classe VoitureFactory.
Elle possède une méthode getVoiture qui prend en paramètre un type de voiture.
Elle retourne l'instance de celle-ci.
Pour éviter à avoir à créer un object VoitureFactory,
cette méthode est static.
##############

##############
Pour finir, nous avons une enum TypeVoiture.
Elle énumère un certain nombre de type de voiture (dans notre exemple, peugeot et renault).
Le constructeur de l'enum TypeVoiture prend en argument un Supplier de l'interface Voiture.
Pour rappel, le Supplier est une interface fonctionnelle qui ne prend aucun argument et renvoie un résultat de Type <T>.
Içi, le résultat est de type Voiture.
Dès lors, l'enum prend en paramètre un Supplier; un objet de type voiture.
Grâce au pointeur sur fonction, nous pouvons dire à une enum, de créer un instance.
##############