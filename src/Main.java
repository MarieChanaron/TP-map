import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String addDots(String numero) {
        char[] numArray = new char[numero.length() + numero.length() / 2 - 1];
        int j = 0;
        int pos = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (i == (3 * pos + 2)) {
                numArray[i] = '.';
                pos ++;
            } else {
                numArray[i] = numero.charAt(j ++);
            }
        }
        return String.valueOf(numArray);
    }


    public static void main(String[] args) {

        /*
        * a) Veuillez initialiser un carnet de contacts avec les informations suivantes :
            • Boris : 0680000000
            • Arthur : 0607070606
            • Thibault : 0605000005
            • Estelle : 0700000700
        * */

        Map<String, String> contacts = new HashMap<>()
        {{
            put("Boris", "0680000000");
            put("Arthur", "0607070606");
            put("Thibault", "0605000005");
            put("Estelle", "0700000700");
        }};


        /* b) Récupérez et affichez le numéro d’Arthur */

        String numArthur = contacts.get("Arthur");

        System.out.println(numArthur);


        /* c) Affichez tout le carnet de contacts comme dans l’exemple ci-dessous */

        System.out.println(contacts);


        /* d) Boris a changé de numéro, veuillez mettre à jour le carnet de contacts : 0799999907 */

        contacts.replace("Boris", "0799999907");

        System.out.println(contacts);


        /*
        e) Créez et utilisez une méthode qui affiche le carnet de contacts. Faire en sorte que les
        numéros s’affichent avec un point entre chaque couple de numéros.
        Exemple : 0799999907 devient 07.99.99.99.07
        */

        contacts.forEach(
                (nom, numero) -> System.out.println("Nom : " + nom + " => Téléphone : " + addDots(numero))
        );

        /*
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Nom : " + entry.getKey() + " => Téléphone : " + addDots(entry.getValue()));
        }
        */


        /*
        f) Mettre à jour votre HashMap pour utiliser une classe User, rattachée au numéro. La classe
        User devra comporter un prénom et une région de type Enum.
        Chaque Contact devra avoir d’une région différente car chaque numéro devra s’afficher avec
        un indicatif en fonction des régions.

        Exemple des indicatifs :
        +33 si le Contact est en France
        +41 si le Contact est en Suisse
        +689 si le Contact est en Polynésie
        +596 si le Contact est en Martinique
        +62 si le Contact est en Indonésie
        Affichez cette nouvelle HashMap.
        */



    }
}