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

![Image](https://github.com/user-attachments/assets/ec1e9e5e-dd0f-4f46-9c2e-e54c9dea70a3)

## 🗃️ Modèle Conceptuel de la Base
![Image](https://github.com/user-attachments/assets/efcec3fa-bf1b-4880-aa58-6aa4ab8ee105)

## ⚙️ Exécution des Tests (console)

![Image](https://github.com/user-attachments/assets/f690ab21-e193-4884-94ac-06a23f9df4ea)

![Image](https://github.com/user-attachments/assets/8c79459a-42b3-4bc0-93ff-76d3449dc73d)

![Image](https://github.com/user-attachments/assets/1e3beb9a-29be-4498-a8e5-b943b5ba2e69)

![Image](https://github.com/user-attachments/assets/bb96c310-381e-422c-8203-3a007ade6dd9)

![Image](https://github.com/user-attachments/assets/9129ea2a-f9de-4af9-815f-50de3b2bfff5)

![Image](https://github.com/user-attachments/assets/d54f23de-823a-413e-a77b-8d897e232393)

![Image](https://github.com/user-attachments/assets/86480c12-8258-4410-829f-19e962917225)

![Image](https://github.com/user-attachments/assets/c701cabd-89f5-47b5-9d65-aa52dae497dc)

![Image](https://github.com/user-attachments/assets/3f553a57-8514-4f0e-b319-f4aa3656c980)

![Image](https://github.com/user-attachments/assets/16be620a-15a5-4f7c-a7d6-6f67c7b7f705)

![Image](https://github.com/user-attachments/assets/c543dfdb-d15a-43bd-b92f-3265ad692c70)

![Image](https://github.com/user-attachments/assets/c608ff6d-33be-41aa-9434-9cca645cfc00)

![Image](https://github.com/user-attachments/assets/62bd00cb-1aeb-44a1-b27d-b17933730fec)

![Image](https://github.com/user-attachments/assets/077dd796-3dbd-437a-9040-e19e6da40b8d)

![Image](https://github.com/user-attachments/assets/1c16b261-36e1-4c6b-9195-b36e6d10d2b3)

![Image](https://github.com/user-attachments/assets/c52f7963-1ace-498b-bf0b-ec0ae9db748d)

![Image](https://github.com/user-attachments/assets/7afa8ff0-42b8-4305-a311-24e49d874c12)

![Image](https://github.com/user-attachments/assets/a5c67d29-8bde-46a6-b124-4a08e6440f38)

![Image](https://github.com/user-attachments/assets/baaded15-5296-4670-990d-fd3b33f0a72e)

![Image](https://github.com/user-attachments/assets/dad07545-6f11-4078-bde1-3c7be77fa79c)

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
