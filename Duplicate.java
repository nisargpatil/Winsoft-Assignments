///Duplicate char in string 
//Duplicate.java

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        String str = "WinSoft Technologies";
        Set<Character> dp = new HashSet<>();
        Set<Character> un = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (!un.add(ch)) {  
                dp.add(ch); 
            }
        }
        System.out.println("Duplicate characters in the string \"" + str + "\" are:");
        for (char ch : dp) {
            int count = occurrences(str, ch);
            System.out.println(ch + " : " + count); 
        }
    }
    public static int occurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}