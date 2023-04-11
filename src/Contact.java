import java.util.HashMap;
import java.util.Map;

public class Contact {

    String nom;
    String region;
    String telephone;
    static Map<String, String[]> contacts = new HashMap<>();

    Contact(String nom, String region, String tel) {
        this.nom = nom;
        this.region = region;
        this.telephone = tel;
        String[] contactInfo = {this.region, this.telephone};
        contacts.put(this.nom, contactInfo);
    }

    public static void afficherContacts() {
        Contact.contacts.forEach(
                (nom, infos) -> System.out.println("Nom : " + nom + " => Téléphone : " + infos[1])
        );
    }

    /* Autre méthode testée
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Nom : " + entry.getKey() + " => Téléphone : " + addDots(entry.getValue()));
        }
     */

    public static void afficherContactsAvecPoints() {
        Contact.contacts.forEach(
                (nom, infos) -> System.out.println("Nom : " + nom + " => Téléphone : " + Telephone.ajoutePoints(infos[1]))
        );
    }

    public static void afficherContactsFormate() {
        Contact.contacts.forEach(
                (nom, infos) -> System.out.println("Nom : " + nom + " => Téléphone : " + Region.regions.get(infos[0]) + Telephone.formateTelephone(infos[1]))
        );
    }

}
