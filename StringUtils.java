package fr.wildcodeschool.unittesting;

public class StringUtils {
    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     *
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        if (candidate.equals("")) {
            return (null);
        } else {
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
            return vowels;
        }
    }

    public static String uniqueVowels(String unique) {
        String bibou = "";
        if (unique.equals("")) {
            return (null);
        } else {
            char[] letters = unique.toCharArray();
            for (int i = 0; i < unique.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0 && bibou.indexOf(letters[i]) == -1) {
                    bibou += letters[i];
                }
            }
            return bibou;

        }
    }
}

