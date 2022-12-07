############## BUILDER ##############

##############Définition##############

##############
Dissocie la construction d'un objet complexe de sa représentation,
de sorte que le même processus de construction permette des représentations
différentes.

Utilisé pour faciliter la création d'objets.
Les constructeurs longs peuvent rendre les objets difficiles à utiliser.
En fournissant un générateur, les objets peuvent être ainsi plus facile à manipuler.

Exemple: 
Imaginons un générateur de personnage pour un jeu de role.
Nous voulons éviter ce genre de constructeur : 
public Hero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor, Weapon weapon) {}
Içi, le nombre de paramètre peut devenir illisible et cette liste de paramètres pourrait continuer à augmenter à l'avenir.
##############

##############Explications:##############
Créons notre classe Hero avec le mot-clé final afin de ne pas hériter de cette classe.
Ajoutons ses attributs toujours en private et final.
Créons une inner class static nommé Builder avec les attributs que nous souhaitons manipuler.
Dans le builder, nous pouvons regrouper la création de nos attributs plus simplement, en créant une 
méthode withWeapon, qui prend en entrée un Arme.
Nous pouvons même imaginer qu'il y a une configuration par défaut.
La classe Builder possède enfin une méthode build qui créer l'instance de sa outer classe avec
lui même en argument.
##############