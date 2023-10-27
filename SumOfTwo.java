import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {

    /**
     * Given two separate arrays of integers and another integer as the potential sum, determine if there is any
     * combination of integers from each array that can be added to produce the potential sum.
     *
     */

    public static void main(String[] args) {
        int[] first = {1, 2, 4, 16};
        int[] second = {12, 22, 24, 116};

        System.out.println(canSum(first, second, 23));
    }

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

}
