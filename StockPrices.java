public class StockPrices {

    /**
     * Given an array of the price of a stock throughout the day, what are the best prices to buy and sell the stock
     * to achieve the maximum profit. Buy must come before Sell.
     *
     */
    public static void main(String[] args) {
        int[] prices = {1,2,1,2,3,5,1501,2000,1000,1500,10};
        System.out.println(findMaxProfit(prices));
    }

    static int findMaxProfit(int[] prices) {
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
}
