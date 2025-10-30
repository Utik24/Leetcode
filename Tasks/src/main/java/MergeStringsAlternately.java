public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder word3 = new StringBuilder();
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        int i = 0;
        int j = 0;
        while (i < lenWord1 || j < lenWord2) {
            if (i < lenWord1) {
                word3.append(word1.charAt(i++));
            }
            if (j < lenWord2) {
                word3.append(word2.charAt(j++));
            }
        }
        return word3.toString();
    }

}
