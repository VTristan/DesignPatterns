#NOM#
Decorator / Wrapper
#OBJECTIF#
Permet d'attacher dynamiquement des responsabilités / fonctionnalités supplémentaires à un objet.
Le Décorateur utilise la composition, une alternative flexible à l'héritage, pour étendre les fonctionnalités d'un objet.

#SOLUTION#

#EXEMPLE#
Dans une application permettant de calculer le prix d'un menu,
chaque plat possède un prix qui lui est propre : le café 3 €, le thé 2 € etc.
Chaque ingrédient à également un prix : supplément chantilly 0.50 €, supplément chocolat 1 € etc.
Avec le pattern Décorateur, nous pouvons facilement et dynamiquement calculer l'ajout d'ingrédient supplémentaire
dans un plat.