import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {

    public static boolean canSum(int[] first, int[] second, int sum){

        if (first == null || second == null || first.length == 0 || second.length == 0) {
            return false;
        }

        Set<Integer> firstSet = new HashSet<>();
        for (int val : first) {
            firstSet.add(val);
        }

        for (int val : second) {
            if (firstSet.contains((sum - val))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 4, 16};
        int[] second = {12, 22, 24, 116};

        System.out.println(canSum(first, second, 23));
    }
}
