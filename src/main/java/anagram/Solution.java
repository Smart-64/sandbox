package anagram;

import java.util.HashMap;
import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("силsч", "числа"));
        System.out.println(isAnagramOptimal("силsч", "числа"));
    }

    public static boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> mapChars = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (mapChars.containsKey(s1.charAt(i))) {
                mapChars.put(s1.charAt(i), mapChars.get(s1.charAt(i)) + 1);
            } else {
                mapChars.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (mapChars.containsKey(s2.charAt(i))) {
                mapChars.put(s2.charAt(i), mapChars.get(s2.charAt(i)) - 1);
                if (mapChars.get(s2.charAt(i)) == 0 ) {
                    mapChars.remove(s2.charAt(i));
                }
            } else {
                return false;
            }
        }
        return mapChars.isEmpty();
    }

    public static boolean isAnagramOptimal(String s1, String s2) {
        HashMap<Character, Integer> dictionaryS1 = new HashMap<>();
        HashMap<Character, Integer> dictionaryS2 = new HashMap<>();


        for (int i = 0; i < s1.length(); i++) {
            dictionaryS1.put(s1.charAt(i), dictionaryS1.getOrDefault(s1.charAt(i), 0) + 1);
            dictionaryS2.put(s2.charAt(i), dictionaryS2.getOrDefault(s2.charAt(i), 0) + 1);
        }
//        for (char ch: s1.toCharArray()) {
//            dictionaryS1.put(ch, dictionaryS1.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch: s2.toCharArray()) {
//            dictionaryS2.put(ch, dictionaryS2.getOrDefault(ch, 0) + 1);
//        }

        return dictionaryS1.equals(dictionaryS2);
    }
}
