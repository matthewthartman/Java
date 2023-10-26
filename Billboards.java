import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Billboards {

    public static void main(String[] args) {
        Integer[] revenues = {5, 6, 4, 0, 1, 0, 5};
        System.out.println(billboards(5, new ArrayList<>(Arrays.asList(revenues))));
    }

    static int billboards(int k, List<Integer> revenue) {

        //Create a list that supports removal
        revenue = new ArrayList<>(revenue);

        //Remove the lowest elements required for evenly dividing by k, keeping the order
        if (revenue.size() % k != 0) {
            int toRemove = 1;
            while ((revenue.size() - toRemove) % k != 0) {
                toRemove++;
            }
            //Remove the smallest 'toRemove' items
            for (; toRemove > 0; toRemove--) {
                revenue.remove(Collections.min(revenue));
            }
        }
        //Perform the calculation
        int subCount = 0, subtotal = 0, maxProfit = 0;
        for (int i = 0; i < revenue.size(); i++) {
            subtotal += revenue.get(i);
            subCount++;
            if (subCount == k) {
                maxProfit += subtotal;
                subCount = 0;
                subtotal = 0;
            }
        }
        return maxProfit;
    }

}
