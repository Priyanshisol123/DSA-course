import java.util.*;
public class Assignment3{
    public static int maxProfitStock(int price[]){
        int Bp=price[0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++){
            if(Bp < price[i]){
                maxProfit=Math.max(maxProfit,price[i]-Bp);
            }else{
                Bp=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        int price1[]={7,6,4,3,1};
        System.out.println(maxProfitStock(price));
    }
}