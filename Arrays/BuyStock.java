public class BuyStock {
    public static void buySellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

            else {
                buyPrice = price[i];
            }
        }

        System.out.println("Max Profit : " + maxProfit);
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        buySellStock(price);
    }
}
