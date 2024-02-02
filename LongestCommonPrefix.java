import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String pref = strs[0];

        for (int i = 0; i < strs.length ; i++) {
            while (strs[i].indexOf(pref) != 0){
                pref = pref.substring(0, pref.length() - 1);
            }
        }

        return  pref;
    }

    public static void main(String[] args) {
        String[] str = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));

    }
}
