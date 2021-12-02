class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0; 
        for(int i = 0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                if(maxProfit < prices[i] - min){
                    maxProfit = prices[i] - min;
                }
            }
        }
        
            
        return maxProfit;
        
    }
}



/*
//max value - min value 
        // position of min > position of max
        //buying price < selling price
        
        //prices = [7,1,5,3,6,4]
        //days      1 2 3 4 5 6
        int price = 0;
        for(int i = 0; i<=prices.length-1; i++){
            //price = 0;
            for(int j = i+1 ; j<=prices.length-1; j++){
                if(prices[i] < prices[j] && price < prices[j] - prices[i]){    // i = buying price and j is selling price
                    price = prices[j] - prices[i];
                    
                }
            }
        }
        return price;
*/