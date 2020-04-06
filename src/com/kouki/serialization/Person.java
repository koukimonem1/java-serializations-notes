package com.kouki.serialization;

import java.io.Serializable;

public class Person  implements Serializable {
   // La valeur du champ serialVersionUID est toujours incluse dans les données contenant le résultat de la sérialisation.
   // Il est utilisé lors de la désérialisation pour vérifier que les données de la sérialisation sont compatibles,
   // relativement aux règles de la sérialisation, avec la classe chargée.
   // Lors de la désérialisation cette valeur est comparée avec celle du champ serialVersionUID de la classe correspondante.
   // Si les deux valeurs sont différentes alors la désérialisation lève une exception de type InvalidClassException.
    private  static  final  long serialVersionUID =  1350092881346723535L;

    private String nom;
    private String prenom;
    private transient  int salaire;

    public Person(String nom, String prenom, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
