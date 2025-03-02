package tree;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        // Втавка/поиск O(log n)

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("people");
        stringTreeSet.add("world");
        stringTreeSet.add("Hello");
        stringTreeSet.add("war");

        System.out.println(stringTreeSet); // [Hello, people, war, world]

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(6);
        integerTreeSet.add(5);
        integerTreeSet.add(8);
        integerTreeSet.add(1);

        System.out.println(integerTreeSet); // [1, 5, 6, 8]

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Eight", 8);
        treeMap.put("Five", 5);

        System.out.println(treeMap); // {Eight=8, Five=5, Three=3, Two=2}
    }
}
