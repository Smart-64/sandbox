package hashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Все методы синхронизированы, что делает его потокобезопасным.
        // Не позволяет null ключи и значения (в отличие от HashMap).
        // Использует устаревший механизм Enumeration вместо Iterator.
        // Медленнее, чем ConcurrentHashMap, который заменил Hashtable в многопоточных средах.

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("First", 1);
        hashtable.put("Eight", 8);
        hashtable.put("Two", 2);
        // hashtable.put(null, 2);       Ошибка! Hashtable не позволяет null-ключи
        // hashtable.put("Three", null); Ошибка! Hashtable не позволяет null-значения

        System.out.println(hashtable); // {First=1, Eight=8, Two=2}

        // Сложность O(1) при поиске/вставке.
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("First", 1);
        hashMap.put("Eight", 8);
        hashMap.put("Two", 2);
        hashMap.put(null, 777);
        hashMap.put("Null value", null);

        System.out.println(hashMap); // {null=777, Eight=8, Null value=null, First=1, Two=2}


        HashMap<Integer, Integer> hashTable = new HashMap<>();
        // Вставка/обновление
        hashTable.put(1, 3);

        // Поиск
        int val = hashTable.get(1);
        System.out.println(val);

        // Удаление ключа "1"
        hashTable.remove(1);

        // Узнать размер
        System.out.println(hashTable.size());
        System.out.println(hashMap.get(1));

    }
}
