package tn.esprit.projetmicroservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.io.Serializable;

@Entity
public class Candidat implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nom, prenom,email;

    public Candidat() {

    }

    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
}
public void  setNom ( String nom) {
    this.nom = nom;
}
public String getPrenom (){
        return prenom;
}
public void setPrenom (String prenom){
        this . prenom = prenom;
}
public String getEmail(){
        return email;
}
public void setEmail ( String email){
        this .  email = email;
}

    public Candidat(int id) {
        this.id = id;
    }

    public Candidat(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }

   // public Candidat() {
      //  super();
        //TOdO AUTO GENERATE CONSTRUCTor

//}
public Candidat (String nom) {
        super ();
        this .nom = nom;
}



}
