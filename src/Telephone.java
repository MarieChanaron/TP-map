public class Telephone {

    public static String ajoutePoints(String numero) {
        char[] numArray = new char[numero.length() + numero.length() / 2 - 1];
        int j = 0; // pour itérer à-travers le numéro passé en paramètre
        int n = 0; // nombre de points
        for (int i = 0; i < numArray.length; i++) {
            if (i == (3 * n + 2)) {
                numArray[i] = '.';
                n ++;
            } else {
                numArray[i] = numero.charAt(j ++);
            }
        }
        return String.valueOf(numArray);
    }

    public static String formateTelephone(String numero) {
        char[] numArray = new char[numero.length() + numero.length() / 2 + 1];
        numArray[0] = '(';
        numArray[1] = numero.charAt(0);
        numArray[2] = ')';
        int j = 1; // pour itérer à-travers le numéro passé en paramètre
        int n = 1; // nombre de points
        for (int i = 3; i < numArray.length; i++) {
            if (i == (3 * n + 1)) {
                numArray[i] = '.';
                n ++;
            } else {
                numArray[i] = numero.charAt(j ++);
            }
        }
        return String.valueOf(numArray);
    }

}
