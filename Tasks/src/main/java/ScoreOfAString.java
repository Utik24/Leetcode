public class ScoreOfAString {
    public static void main(String[] args) {

        String s = "hello";
        char[] letters;
        letters = s.toCharArray();
        int sum = 0;
        for(int i = 0; i<s.length()-1;i++){
            sum+=Math.abs(letters[i]-letters[i+1]);
            System.out.println(Math.abs(letters[i]-letters[i+1]));
        }


}}
