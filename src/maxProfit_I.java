
public class maxProfit_I {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=(int) (Math.random()*100);
		}
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		System.out.println(maxProfit2(arr));
		
	}
	 public static int maxProfit(int[] prices) {
	        int max=0;int max_index=-1;
	        int min=prices[0];int min_index=-1;
	        int maxProfit=0;
	        for(int i=0;i<prices.length;i++)
	        {
	        	if(prices[i]>max)
	        	{
	        		max=prices[i];
	        		max_index=i;
	        	}
	        	if(prices[i]<min)
	        	{
	        		min=prices[i];
	        		min_index=i;
	        	}
	        		
	        }
	        System.out.println("max="+max+" index:"+max_index);
	        System.out.println("min="+min+" index:"+min_index);
	        
	        if(max_index>min_index)
	        {
	        	maxProfit=max-min;
	        	System.out.println("maxProfit="+maxProfit);
	        }
	        else
	        {
	        	int left_min=prices[0];
	        	int right_max=0;
	        	int p1=0;
	        	int p2=0;
	        	for(int i=0;i<max_index;i++)//找出左边最小值
	        	{
	        		if(prices[i]<left_min)
	        		{
	        			left_min=prices[i];
	        		}
	        	}
	        	for(int i=min_index;i<prices.length;i++)//找出左边最小值
	        	{
	        		if(prices[i]>right_max)
	        		{
	        			right_max=prices[i];
	        		}
	        	}
	        	
	        	p1=max-left_min;
	        	p2=right_max-min;
	        	System.out.println("p1="+p1+"p2="+p2);
	        	return p1>p2?p1:p2;
	        	
	        }
	        
	        
	        
	        return maxProfit;
		 
	    }
	 
	 public static int maxProfit2(int[] prices) {
		 
		 int maxProfit=0;
		 int temp=0;
		 for(int i=prices.length-1;i>0;i--)
		 {
			 for(int j=i-1;j>0;j--)
			 {
				 temp=prices[i]-prices[j];
				 if(temp>maxProfit)
					 maxProfit=temp;
			 }
		 }
		 return maxProfit;
		 
		 
	 }
}
