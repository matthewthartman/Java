import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopLargest {

    /**
     * Write a function to determine and return the top N values from a list of integers
     *
     */

    public static void main(String[] args) {
        //create array randomly
        int[] list = {1, 10, 100, 200, 50, 23, 25, 101};
        //find top n largest and print
        printArray(findTopN(list, 3));

    }

    static int[] findTopN(int[] array, int top) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(top, Comparator.comparingInt(Integer::intValue));
        queue.add(0);
        for (int a : array) {
            if (queue.size() < top) {
                queue.add(a);
            } else {
                int head = queue.peek();
                if (a > head) {
                    queue.remove(head);
                    queue.add(a);
                }
            }
        }
        int[] ret = new int[top];
        for (int i = 0; i < top; i++) {
            ret[i] = queue.remove();
        }
        return ret;
    }

    static void printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        System.out.println(builder);
    }

}
