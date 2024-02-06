# TP 1: Mon Parking Java

## Objectifs
Développer une application permettant de gérer des places de stationnement dans une parking. 

## Scénario
On suppose qu’il existe un parking avec un nombre de places fixes pouvant accueillir deux types de véhicules (Moto ou voiture). Une voiture ne peut pas se garer sur une place de moto et inversement. Quand un utilisateur veut rentrer dans le parking il doit préciser son type de véhicule. Le système doit pouvoir lui dire s’il existe une place libre correspondant à son véhicule. Dans le cas où il existe une place libre, le système affiche un message de succès sinon un message d’erreurs indiquant qu’aucune place n’est disponible.  De même quand un utilisateur veut sortir du parking, il doit préciser le typê de véhicule; le système libère alors la place occupée par le véhicule. 

## Fonctionnalités 
- Permettre de créer un parking avec un nombre de places x pour chaque type de véhicule

- Permettre à un utilisateur de préciser le type de véhicule à garer (moto ou voiture)

- Gérer les places en fonctions des entrées/sorties de véhicules
    - Afficher un message de bienvenue quand une place est disponible
    - Afficher un message d’erreurs quand il n’y a plus de places

- Générer un fichier csv contenant l’historique des opérations d’entrées sorties

- Gestion d’erreurs
    - De saisie (mauvais type de véhicules)

 ## Contraintes
 - L’application fonctionne uniquement sur une console
 - Groupe de deux
 - Utiliser un gestionnaire de version
 - Utiliser obligatoirement 
    - Héritage, interface
    - Collections

