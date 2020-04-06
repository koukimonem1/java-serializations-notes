package com.kouki.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("out-stream/personne.ser");
        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(file)) ;
        Person p = new Person("KOUKI","Abdelmonem",2000);
        oos.writeObject(p);
    }
}
