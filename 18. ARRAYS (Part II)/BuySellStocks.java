import java.util.*;
//Problem to buy and sell stocks at max profit in an array

public class BuySellStocks{
    public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ //Case1: profit
                int profit= prices[i]-buyPrice; //Today's Profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit is : "+buyAndSellStocks(prices));
    }
}