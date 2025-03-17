package isomorphicStrings;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("foo", "bar"));
        // System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);

            if (map.containsKey(x)) {
                if (map.get(x) != y) {
                    return false;
                }
            } else {
                if (set.contains(y)) {
                    return false;
                }
            }
            map.put(x, y);
            set.add(y);
        }

        return true;
    }
}
