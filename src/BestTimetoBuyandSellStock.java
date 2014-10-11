
public class BestTimetoBuyandSellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int maxProfit(int[] prices) {
		 if(prices.length==0)return 0;
		 int maxProfit=0;
		 int min=prices[0];
		 for(int i=0;i<prices.length;i++)
		 {
			 maxProfit=prices[i]-min>maxProfit?prices[i]-min:maxProfit;
			 min=prices[i]<min?prices[i]:min;
		 }
		 
		 return maxProfit;
		 
		 
	 }
	
}
