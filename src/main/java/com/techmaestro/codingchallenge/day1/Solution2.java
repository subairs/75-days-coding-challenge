package com.techmaestro.codingchallenge.day1;

public class Solution2 {
	  public static void main(String args[]) {
		  Solution2 solution2=new Solution2();
		  int[] dayRates= {7,1,5,3,6,4};
		  int maxProfit=solution2.maxProfit(dayRates);
		  System.out.println(maxProfit);
	  }

	  
//    public int maxProfit(int[] prices) {
//    int maxProfit=0;
//    for(int i=0;i<prices.length;i++){
//        for(int j=i+1;j<(prices.length);j++){
//            int profitDifference=(prices[j]-prices[i]);
//            if(maxProfit<profitDifference)
//                maxProfit=profitDifference;
//        }
//    }
   
//    return maxProfit;
   
//}
    public int maxProfit(int[] prices) {
       int maxProfit=0;
       int  buy= prices[0];
        for(int i=0;i<prices.length;i++){
        	int difference=prices[i]-buy;
        	buy=Math.min(buy, prices[i]);
        	maxProfit=Math.max(maxProfit, difference);        
       }
        return maxProfit;
        
    }
	
	
}
