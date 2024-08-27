/*
 * Simple method to sort the contents of a HashMap by key (ascending or descending) and return the contents (K, V)
 * as an array. Also contains a utility to generate a random Map of specified size.
*/

import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<Integer, String> map = buildRandomHashMap(100);
        printList(sortMap(map, -1));
    }

    static List<Map.Entry<Integer, String>> sortMap(Map<Integer, String>  map, int... descending){
        List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
        if (descending.length > 0) {
            list.sort((a, b) -> b.getKey().compareTo(a.getKey()));
        } else {
            list.sort(Map.Entry.comparingByKey());
        }
        return list;
    }

    static void printList(List<Map.Entry<Integer, String>> list) {
        if (list != null) {
            int num = 1;
            for (Map.Entry<Integer, String> entry : list) {
                System.out.println(num + ": " + (entry.getKey()) + ", " + entry.getValue());
                num++;
            }
        }
    }

    static Map<Integer, String> buildRandomHashMap(int size) {
        Map<Integer, String>  map = new HashMap<>();
        for (int i = 1; i <= size; i++) {
            map.put(Math.toIntExact(Math.round(Math.random() * 10000)), String.valueOf(Math.round(Math.random()*1000000)));
        }
        return map;
    }
}
