package tn.esprit.microservicejob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Job implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    private Boolean etat;

    public Job() {

    }

    public int getId() {
        return id;
    }

    public String getnom() {
        return nom;
    }

    public void setservice(String service) {
        this.nom = service;
    }

    public Boolean getetat() {
        return etat;
    }

    public void setetat(String prenom) {
        this.etat = etat;
    }

    public Job(String nom, Boolean etat) {
        this.nom = nom;
        this.etat = etat;
    }

    public void setetat(boolean etat) {
    }

    public void setEtat(boolean disponible) {
    }
}


