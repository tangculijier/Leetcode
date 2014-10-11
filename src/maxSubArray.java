
public class maxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray2(a));

	}
	 public static int maxSubArray(int[] A) 
	 {
	        int max=A[0];
	        for(int i=0;i<A.length;i++)
	        {
	        	int sum=0;
	        	for(int j=i;j<A.length;j++)
	        	{
	        		sum+=A[j];
	        		if(sum>max)
	        		{
	        			max=sum;
	        			System.out.println("max"+max);
	        		}
	        	}
	        }
	        	
		 return max;
	  }
	 public static int maxSubArray2(int[] A) 
	 {
		 int max=A[0];
		 int sum=0;
		 for(int i=0;i<A.length;i++)
		 {
			 sum+=A[i];
			 if(sum>max)
				 max=sum;
			 
			 if(sum<0)
			 sum=0;
		 }
		 return max;
	 }
	
}
