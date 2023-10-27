import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String[] magazine = {"Two", "times", "three", "is", "not", "four", "Two"},
        note = {"two", "times", "two", "is", "four"};

        checkMagazine(Arrays.asList(magazine), Arrays.asList(note));

    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Hashtable<String, Long> magTable = new Hashtable<>();
        for (String word : magazine) {
            if (magTable.containsKey(word)) {
                magTable.put(word, magTable.get(word) + 1);
            } else {
                magTable.put(word, 1L);
            }
        }

        Hashtable<String, Long> noteTable = new Hashtable<>();
        for (String word : note) {
            if (noteTable.containsKey(word)) {
                noteTable.put(word, noteTable.get(word) + 1);
            } else {
                noteTable.put(word, 1L);
            }
        }

        for (Map.Entry<String, Long> entry : noteTable.entrySet()) {      //Set<Map.Entry<String, Long> noteTable.entrySet()
            if (!magTable.containsKey(entry.getKey())) {
                System.out.println("False");
                return;
            }
            if (noteTable.get(entry.getKey()) > magTable.get(entry.getKey())) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}
