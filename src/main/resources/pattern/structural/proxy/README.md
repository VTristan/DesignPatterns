#NOM#
Proxy / Surrogate
#OBJECTIF#
Le modèle Proxy nous permet de créer un intermédiaire qui agit comme une interface avec une autre ressource,
Un objet proxy masque l'objet d'origine et en contrôle l'accès.
Le pattern Proxy fourni un intermédiaire entre la partie cliente et un objet pour contrôler les accès à ce dernier.

#SOLUTION#
TODO
#EXEMPLE#
Exemple1 : L'accès à un objet nécéssite une authentification.
ex spring security

Exemple2 : L'accès à un objet est couteux en ressource, nous pouvons mettre en place un cache pour éviter de charger à chaque appel la ressource.
exemple photo et la miniature
exemple du cache !

Exemple3 : Le commit ou rollback d'une insertion dans une base de donnée.
@transactionnal
commit/rollback
