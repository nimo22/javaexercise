package leetcodeeasy;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
/*
 * Accepted
Runtime
Details
1ms
Beats 99.92%of users with Java
Memory
Details
61.89MB
Beats 20.28%of users with Java
 */
public class question30 {
    public int maxProfit(int[] prices) {

        int indexbuy=0;
        int indexsell=0;
        int total=0;

        for(int i=0;i<prices.length;i++){
            for(int r=i+1;r<prices.length;r++){
                if(prices[r]-prices[i]>total){
                    total=prices[r]-prices[i];
                    indexbuy=prices[i];
                    indexsell=prices[r];
                }
            }

        }
        if(indexsell==0){
            return 0;
        }
        System.out.println(indexsell);


        return (indexsell-indexbuy);
        
    }
}
