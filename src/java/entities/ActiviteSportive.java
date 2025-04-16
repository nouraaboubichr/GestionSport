/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ActiviteSportive")
public class ActiviteSportive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private int capaciteMax;

    @OneToMany(mappedBy = "activite", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InscriptionSport> inscriptions;
    
    public ActiviteSportive(){
    }

    public ActiviteSportive(String nom, String description, int capaciteMax) {
        this.nom = nom;
        this.description = description;
        this.capaciteMax = capaciteMax;
    }

    public Long getId() {
        return id; 
    }
    public void setId(Long id) { 
        
        this.id = id;
    }

    public String getNom() { 
        return nom; 
    }
    public void setNom(String nom) {
        this.nom = nom; 
    }

    public String getDescription() { 
        return description;
    }
    public void setDescription(String description) {
        this.description = description; 
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }
    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public List<InscriptionSport> getInscriptions() {
        return inscriptions;
    }
    public void setInscriptions(List<InscriptionSport> inscriptions) { 
        this.inscriptions = inscriptions;
    }
}


