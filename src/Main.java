public class Main {

    public static void main(String[] args) {

        /*
        * a) Veuillez initialiser un carnet de contacts avec les informations suivantes :
            • Boris : 0680000000
            • Arthur : 0607070606
            • Thibault : 0605000005
            • Estelle : 0700000700
        * */

        new Contact("Boris", "France", "0680000000");
        new Contact("Arthur", "Suisse", "0607070606");
        new Contact("Thibault", "Polynésie", "0605000005");
        new Contact("Estelle", "Martinique", "0700000700");


        /* b) Récupérez et affichez le numéro d’Arthur */

        String[] coordonneesArthur = Contact.contacts.get("Arthur");
        String numArthur = coordonneesArthur[1];

        System.out.println("Téléphone d'Arthur : " + numArthur);


        /* c) Affichez tout le carnet de contacts comme dans l’exemple ci-dessous */

        System.out.println(); // Saut de ligne
        Contact.afficherContacts();


        /* d) Boris a changé de numéro, veuillez mettre à jour le carnet de contacts : 0799999907 */

        String[] borisInfos = Contact.contacts.get("Boris");
        borisInfos[1] = "0799999907";
        Contact.contacts.replace("Boris", borisInfos);

        System.out.println("\nCarnet à jour :");
        Contact.afficherContacts();


        /*
        e) Créez et utilisez une méthode qui affiche le carnet de contacts. Faire en sorte que les
        numéros s’affichent avec un point entre chaque couple de numéros.
        Exemple : 0799999907 devient 07.99.99.99.07
        */

        System.out.println(); // Saut de ligne
        Contact.afficherContactsAvecPoints();


        /*
        f) Mettre à jour votre HashMap pour utiliser une classe Contact, rattachée au numéro. La classe
        User devra comporter un prénom et une région de type Enum.
        Chaque Contact devra avoir une région différente car chaque numéro devra s’afficher avec
        un indicatif en fonction des régions.

        Exemple des indicatifs :
        +33 si le Contact est en France
        +41 si le Contact est en Suisse
        +689 si le Contact est en Polynésie
        +596 si le Contact est en Martinique
        +62 si le Contact est en Indonésie
        Affichez cette nouvelle HashMap.
        */

        new Region("+33", "France");
        new Region("+41", "Suisse");
        new Region("+689", "Polynésie");
        new Region("+596", "Martinique");
        new Region("+62", "Indonésie");

        System.out.println(); // Saut de ligne
        Contact.afficherContactsFormate();
    }
}