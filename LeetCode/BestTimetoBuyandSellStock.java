public class BestTimetoBuyandSellStock {


    public static void main(String[] args){
        int[] prices = {7, 3, 5, 1, 7, 8, 12, 8,12};
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0 ;i<prices.length;i++ )
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            int currentProfit=prices[i]-min;
            if(currentProfit>maxProfit){
                maxProfit=currentProfit;
            }
        }
       System.out.print(maxProfit);

    }
}
