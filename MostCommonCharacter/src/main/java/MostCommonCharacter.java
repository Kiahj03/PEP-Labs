import java.util.Collections;
import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> s = new HashMap<Character, Integer>();
        char[] str_arr = str.toCharArray();
        char ans = 0;
        int count = 0;

        for(char c : str_arr){
            if(s.containsKey(c)){
                s.put(c, s.get(c) + 1);
            }
            else {
                s.put(c, 1);
            }
            if(count < s.get(c)){
                ans = c;
                count = s.get(c);
            }
        }

        return ans;
    }
}
