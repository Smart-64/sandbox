package algoritm;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 5, 2, 124, 346, 31));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3, 5, 2, 124, 346, 31));
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println("\n");

        // Сложность алгоритма при получении эл-та по индексу = O(1).
        System.out.println(arrayList.get(3)); // 124

        // Сложность алгоритма при добавлении эл-та в конец ArrayList/LinkedList, в начало LinkedList = O(1).
        arrayList.add(777);
        linkedList.addFirst(777);
        linkedList.addLast(777);

        System.out.println(arrayList); // [3, 5, 2, 124, 346, 31, 777]
        System.out.println(linkedList); // [777, 3, 5, 2, 124, 346, 31, 777]
        System.out.println("\n");

        // Сложность алгоритма при добавлении эл-та в середину или удаление из ArrayList = O(n).

        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.add(3, 888);
        System.out.println(arrayList);
        System.out.println("\n");

        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("One", 1, "Eight", 8));
        // Сложность алгоритма по ключу = O(1).
        System.out.println(hashMap);
    }
}
