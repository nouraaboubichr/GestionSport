# 🏋️‍♀️ Gestion des Inscriptions Sportives

## 📚 Sommaire
- 📌 Contexte  
- ❓ Problématique  
- 🎯 Objectifs  
- 🧩 Diagramme de Classe  
- 🗃️ Modèle Conceptuel de la Base  
- ⚙️ Exécution des Tests  
- 🛠 Technologies Utilisées  

---

## 📌 Contexte

Ce projet est une application Java de gestion des activités sportives dans un cadre universitaire ou associatif. Il permet :

- Aux administrateurs de gérer les activités et les coachs  
- Aux utilisateurs de s’inscrire à des activités  
- Aux coachs d'encadrer les activités  
- De suivre les inscriptions et générer des statistiques par activité

---

## ❓ Problématique

La gestion manuelle des inscriptions aux activités sportives pose plusieurs problèmes :

- ❌ Surcharge des administrateurs pour l'enregistrement manuel  
- ❌ Pas de visibilité sur les activités populaires  
- ❌ Difficulté à limiter le nombre d'inscrits selon les capacités  
- ❌ Absence de données exploitables pour les décisions  

---

## 🎯 Objectifs

🎯 Créer une plateforme Java permettant :

- 📋 L’ajout et la gestion des **activités sportives**
- 👤 L’inscription des **utilisateurs** à ces activités
- 🧑‍🏫 La gestion des **coachs** avec leur expérience
- 🧑‍💼 L’ajout d’**administrateurs** pour la supervision
- 📊 Le suivi statistique des inscriptions par activité

---

## 🧩 Diagramme de Classe

![Image](https://github.com/user-attachments/assets/79bfa225-a658-46f3-9343-22862094034f)

## 🗃️ Modèle Conceptuel de la Base
![Image](https://github.com/user-attachments/assets/8205683a-f088-4cb6-bb02-06a006aea6ab)

## ⚙️ Exécution des Tests (console)

![Image](https://github.com/user-attachments/assets/3b056bf7-6a5d-4698-bbd9-fd5d37588466)
![Image](https://github.com/user-attachments/assets/6fae4abd-c2e0-4634-9a41-870ed440cdd8)
![Image](https://github.com/user-attachments/assets/67b4a6c0-901e-47e1-8d03-99222fc03a7e)
![Image](https://github.com/user-attachments/assets/d3a1facb-eccc-4e61-9852-01049c7b6e90)
![Image](https://github.com/user-attachments/assets/3b85cb65-8126-4c09-a736-56868f7f9537)
![Image](https://github.com/user-attachments/assets/d43cba7a-0737-4e6e-a1d5-8438096c28e3)
![Image](https://github.com/user-attachments/assets/f813b1d4-be81-4970-87a1-9f48733e796e)
![Image](https://github.com/user-attachments/assets/2f93e098-ba8d-4af1-b258-f120914cba04)
![Image](https://github.com/user-attachments/assets/93c91680-01ea-4b53-9eb7-d0e0c6252e28)
![Image](https://github.com/user-attachments/assets/9b55ab53-5fe9-48bc-89b4-29ffffd9a554)
![Image](https://github.com/user-attachments/assets/2c399cdb-eef1-4bb3-9fc2-0cd34884f4d3)
![Image](https://github.com/user-attachments/assets/2ec468e1-d838-4ecf-b53a-9724c7399de3)
![Image](https://github.com/user-attachments/assets/1b75ada6-a4eb-42fb-b52f-729b809a6621)
![Image](https://github.com/user-attachments/assets/7e7669cb-1495-4a02-a581-c1513fca8214)
![Image](https://github.com/user-attachments/assets/50b4aa0e-b538-492e-9cca-67be2f47c554)
![Image](https://github.com/user-attachments/assets/c4a88d69-6220-4797-9442-d5daf24cadd6)
![Image](https://github.com/user-attachments/assets/24a80a81-5320-4989-ae23-60395131a4cb)
![Image](https://github.com/user-attachments/assets/1bf6de4f-1d87-46ba-bca4-908e2b5a4dff)
![Image](https://github.com/user-attachments/assets/aa40ef63-3438-4f2a-a4f4-9c74577f0498)
![Image](https://github.com/user-attachments/assets/985e6182-2043-4987-a0e9-41cf39bb494d)

## 🛠 Technologies

### ⚙️ Côté serveur (Backend)
- **Java Web** – Utilisé pour la logique métier.
- **Hibernate** – Pour la persistance des entités sportives, utilisateurs, inscriptions.
- **JDBC** – Pour les requêtes spécifiques.

### 🗃️ Base de Données
- **MySQL** – Stockage des entités.
- **XAMPP** – Pour le serveur MySQL local.
- **phpMyAdmin** – Pour visualiser et manipuler la base de données.

### 🧩 Entités principales :

| Entité             | Description |
|--------------------|-------------|
| **User**           | Utilisateur général (nom, email, mot de passe). |
| **Coach**          | Hérite de `User`, avec champ `experience`. |
| **Admin**          | Hérite de `User`. |
| **ActiviteSportive** | Nom, description, capacité maximale. |
| **InscriptionSport** | Activité, utilisateur inscrit, date. |

---
