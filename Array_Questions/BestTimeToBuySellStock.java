public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0; 

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println(); 

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}