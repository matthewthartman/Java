/**
 * given an array of int where the values are stock prices throughout the day
 * find the best trade, max profit
 * requirement: buy needs to occur before sell
 */
public class StockPrices {

    public static int maxProfit(final int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {4000,5000,1,19,6,5},
                {},
                {1000},
                {40,50,60,70,60,50,10,80,140,10,50},
                {5000,4000,3000,2000,1000},
                {533,100,400,600,10, 599}
        };

        int[] expected = {
                1000,
                0,
                0,
                130,
                0,
                589
        };

        for (int i = 0; i < expected.length; i++) {
            final int maxProfit = maxProfit(inputs[i]);
            if(maxProfit == expected[i]){
                System.out.println("TEST " + (i+1) + " ----> SUCCESS");
            } else {
                System.out.println("TEST " + (i+1) + " ----> FAIL : Expected " + expected[i] + " Received " + maxProfit );
            }
        }
    }
}

