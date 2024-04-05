# Réalisations du Projet de Gestion de Tâches en Java

Ce document récapitule les réalisations effectuées dans le cadre du TP de gestion de tâches en Java.

## Fonctionnalités implémentées

### Ajout d'une tâche

- [ X ] Formulaire de saisie des détails de la tâche.
  Le formulaire est d'ajout de tache et de saisie est en place, l'ajout ne fonctionne pas mais l'utilisateur peux remplir les informations qu'il souhaite. Il est compose de JTextField pour les informations et un JComboBox pour les différents niveaux de priorité.
- [ X ] Bouton "Ajouter".
  Bouton Ajouter présent mais n'ajoute rien
- [ ] Test unitaire associé.
      Aucun Test réalisé

Toute l'affichage fonctionne, la combobox affiche les niveau de priorité des taches... mais aucune méthode non été liées pour le faire fonctionner.
Les methodes ont été créer mais pas compléter. Aucun Test de fait

### Modification d'une tâche

- [ ] Mécanisme de sélection et de modification de la tâche.
- [ ] Bouton "Modifier".
- [ ] Test unitaire associé.

En ce qui concerne cette partie, rien n'a été fait

### Suppression d'une tâche

- [ ~ ] Mécanisme de sélection et de suppression de la tâche.
  Le mecanisme visuel est présent mais le backend (methode pour realiser l'action) ne fonctionne pas.
- [ X ] Bouton "Supprimer".
- [ ] Test unitaire associé.

Un bouton supprimer, une jlabel indiquant l'action ainsi qu'un ComboBox ont été créer pour cette partie. L'idée était de selectionner le titre de la tache et de la supprimer en cliquant sur le bouton

### Visualisation des tâches

- [ ] Affichage des détails des tâches existantes.
- [ ] Mécanisme de filtrage ou de tri des tâches.
- [ ] Test unitaire associé.

Rien n'a été fait

### Gestion des priorités

- [ X ] Possibilité de définir la priorité lors de l'ajout ou de la modification de la tâche.
  Le JComboxBox propose les différents niveaux de priorité
- [ ] Test unitaire associé.

Une combox affiche les priorités disponible, le but été de vérifier après l'appuie sur le bouton si l'entré combobox correspondait aux entrés disponible

### Possibilité d'évolution

- [ X ] Description claire des fonctionnalités potentielles à ajouter dans le futur pour améliorer l'application.
      Sans parler des méthodes de bases qui ne sont pas et qui devrait être implémenté, des fonctionnalitées tel que l'affichage d'un calendrier avec les tâches pourrait être intéréssant, tel outlook le propose par exemple avec les réunions. Le calendrier se composerait de tous les mois de l'année, s'affichera à la date actuelle avec des cases pour chaque jour avec une liste apparente sur ses cases avec les taches du jours. Une autre fonctionnalité serait un système de rappel à x jours/heures de la date d'echeance afin de rappeler l'utilisateur qu'il doit faire quelque chose
- [ ] Réflexion sur la modularité et la scalabilité de l'application pour faciliter les évolutions futures.



## Bonus

### Implémentation de la sérialisation des tâches

- [ ] Sauvegarde des tâches lors de la fermeture de l'application.
- [ ] Chargement des tâches lors de l'ouverture de l'application.
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)
