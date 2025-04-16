/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.ActiviteSportiveDao;
import dao.CoachDao;
import dao.InscriptionSportDao;
import dao.UserDao;
import entities.ActiviteSportive;
import entities.Admin;
import entities.InscriptionSport;
import entities.User;
import java.time.LocalDate;
import util.HibernateUtil;
import entities.Coach;


/**
 *
 * @author hp
 */
public class Test {
     public static void main(String[] args) {
     // Initialiser la session Hibernate
    HibernateUtil.getSessionFactory();
    
    // Initialiser les DAO
        ActiviteSportiveDao activiteDao = new ActiviteSportiveDao();
        InscriptionSportDao inscriptionDao = new InscriptionSportDao();
        UserDao userDao = new UserDao();
        CoachDao coachDao = new CoachDao();

        // Create des utilisateurs (par exemple des étudiants)
        User user1 = new User("Ali", "ali@example.com", "password123");
        User user2 = new User("Noura", "Noura@example.com", "password456");
        userDao.create(user1);
        userDao.create(user2);
        
        // Créer un admin
        Admin admin1 = new Admin("Admin Principal", "admin@example.com", "adminpass");
        userDao.create(admin1);

        
         // Créer des coachs
        Coach coach1 = new Coach("Coach A", "coachA@example.com", "coachpass1", 5);
        Coach coach2 = new Coach("Coach B", "coachB@example.com", "coachpass2", 10);
        coachDao.create(coach1);
        coachDao.create(coach2);


        // Create une activité sportive
        ActiviteSportive activite1 = new ActiviteSportive("Basketball", "Sport de ballon en équipe", 20);
        ActiviteSportive activite2 = new ActiviteSportive("Football", "Sport populaire en équipe", 25);
        activiteDao.create(activite1);
        activiteDao.create(activite2);

        // Create des inscriptions pour ces utilisateurs
        InscriptionSport inscription1 = new InscriptionSport();
        inscription1.setActivite(activite1);
        inscription1.setUser(user1);
        inscription1.setDate(LocalDate.of(2025, 4, 10));
        
        InscriptionSport inscription2 = new InscriptionSport();
        inscription2.setActivite(activite2);
        inscription2.setUser(user2);
        inscription2.setDate(LocalDate.of(2025, 4, 10));

        inscriptionDao.create(inscription1);
        inscriptionDao.create(inscription2);

        // Afficher toutes les inscriptions sportives
        System.out.println("\n Toutes les inscriptions sportives :");
        for (InscriptionSport inscription : inscriptionDao.findAll()) {
            System.out.println("Activité : " + inscription.getActivite().getNom() + ", Utilisateur : " + inscription.getUser().getNom() + ", Date : " + inscription.getDate());
        }

        // Afficher les inscriptions pour un utilisateur spécifique (par ID)
        System.out.println("\n Inscriptions de l'utilisateur Ali :");
        for (InscriptionSport inscription : inscriptionDao.findAll()) {
            if (inscription.getUser().getId() == user1.getId()) {
                System.out.println("Activité : " + inscription.getActivite().getNom() + ", Date : " + inscription.getDate());
            }
        }

        // Afficher les activités d'un utilisateur
        System.out.println("\n Activités auxquelles l'utilisateur Mariam est inscrit :");
        for (InscriptionSport inscription : inscriptionDao.findAll()) {
            if (inscription.getUser().getId() == user2.getId()) {
                System.out.println("Activité : " + inscription.getActivite().getNom() + ", Date : " + inscription.getDate());
            }
        }

        // Afficher les inscriptions à une activité spécifique (par ID)
        System.out.println("\n Inscriptions à l'activité Football :");
        for (InscriptionSport inscription : inscriptionDao.findAll()) {
            if (inscription.getActivite().getId() == activite2.getId()) {
                System.out.println("Utilisateur : " + inscription.getUser().getNom() + ", Date : " + inscription.getDate());
            }
     
     }
    
     }
}
