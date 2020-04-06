package com.kouki;

public class Notes0 {
 // sérializer un objet consiste à le convertir en un tableau d'octets, que l'on peut ensuite écrire dans un fichier, envoyer sur un réseau au travers d'une socket
 // Ce mécanisme existe depuis les débuts de l'API Java I/O
 // Il suffit de passer tout objet qui implémente l'interface Serializable à une instance de ObjectOutputStream pour sérialiser un objet
//Si on veut pas sérialiser des champs, alors devraient être marqués avec le mot-clé transient. Cela a pour effet de les retirer du flux sérializé. Après désérialization, ces champs seront à null

}
