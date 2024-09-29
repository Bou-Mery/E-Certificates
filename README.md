
# TP1 Exercice 3 : - E-Certificates

## Description

Ce projet Android est une application simple qui permet aux utilisateurs de répondre à des questions et de naviguer entre différentes activités. L'application utilise une interface graphique intuitive pour afficher des options sous forme de cases à cocher et de boutons radio, et permet aux utilisateurs de sélectionner leurs réponses. L'objectif principal est de démontrer l'utilisation de l'intention pour passer des données entre les activités.

## Démarche

1. **Création de l'interface graphique**  
   - Le fichier XML associé à l'interface principale (`activity_main.xml`) a été créé pour inclure les éléments suivants :
     - Un `MaterialToolbar` pour afficher le titre de l'application.
     - Des `TextView` pour poser des questions.
     - Des `CheckBox` pour permettre aux utilisateurs de faire des choix multiples.
     - Un `RadioGroup` avec des `RadioButton` pour des choix exclusifs.
     - Deux boutons : un pour passer à l'activité suivante et un pour quitter l'application.

2. **Gestion des interactions utilisateur**  
   - Le code Java dans `MainActivity.java` gère les événements de clic sur les boutons. Lorsque l'utilisateur clique sur le bouton "Suivant", les réponses sélectionnées sont envoyées à une autre activité (`SecondActivity`). Les réponses sont extraites des `CheckBox` et du `RadioGroup`, et sont passées à l'aide d'un `Intent`.
   - En cliquant sur le bouton "Quitter", l'activité se termine et l'application se ferme.

## Fonctionnalités

- **Navigation entre les activités** : L'utilisateur peut passer à une autre activité en sélectionnant des options et en cliquant sur "Suivant".
- **Quitter l'application** : L'utilisateur peut quitter l'application à tout moment en cliquant sur "Quitter".

---
# Technologies Utilisées

- **Langage de programmation :** Java
- **IDE :** Android Studio
- **Version Android :** API 24+ 

---
# Démonstration Vidéo

Voici une courte démonstration de l'application :

https://github.com/user-attachments/assets/a9c0fa5c-cd02-4499-905d-a13e3987c450



### Auteur
Projet réalisé par **[BOUKHRAIS Meryem]** dans le cadre du TP d'Android.
