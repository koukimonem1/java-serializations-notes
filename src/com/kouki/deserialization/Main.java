package com.kouki.deserialization;

import com.kouki.serialization.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("out-stream/personne.ser");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Person p = (Person)ois.readObject();
        /**
         * salaire = 0 car le champ est transient
         */
        System.out.println("Nom = "+p.getNom()
                +" Prenom = "+p.getPrenom()
                +" Salaire = "+p.getSalaire());
    }
}
