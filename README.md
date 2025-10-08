# 🎌 Course d'animaux 🎌

## 🎯 Objectif
Le but de ce projet est de créer un petit jeu console en Java simulant une course entre plusieurs animaux, chacun animé par un thread indépendant.
Cette activité permet de visualiser concrètement le fonctionnement concurrent des threads : plusieurs tâches s’exécutent en même temps, sans qu’une bloque les autres.
Chaque animal vit sa propre aventure, avance à son propre rythme et participe à une course collective.

## 📓 Principe du jeu
Plusieurs animaux (Tortue, Lapin, Canard, Cochon) s'élancent en avançant chacun de manière aléatoire avec une vitesse et une énergie différente.
Le premier à avoir fini la course fait est déclaré vainqueur.

## 🖥 Sortie console 
Affichage en temps réel de la course :

Lapin : ----------------------------------------🐇

Tortue : ------------------🐢

Cochon : ----------------------------🐖

Canard : ----------------------------------🪿

Lapin gagne !

Et quand tout le monde est arrivé :

Classement final :
1. Lapin
2. Canard
3. Cochon
4. Tortue

## Fonctionnement interne

Chaque animal est une instance de la classe Animal qui implémente Runnable.
Tous les animaux sont lancés en même temps via les threads qui continuent d'avancer jusqu'à la fin de la course, 
la position finale est utilisée pour afficher le classement.
La course est surveillée par la classe Race qui déclare le premier vainqueur.
Une synchronisation empêche qu'un second animal déclare la victoire en même temps.