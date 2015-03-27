
public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args) {
		FindMinimuminRotatedSortedArray xxxx=new FindMinimuminRotatedSortedArray();
		int[] a={4,5,6,7,0,1,2,3};
		int[] b={1,2,3};
		int[] c={4,3,2,1};
		int [] d={3,1,2};
		System.out.println(xxxx.findMin2(a));

	}
	 public int findMin(int[] num) {
		 if(num.length==1) return num[0];
	        for(int i=num.length-1;i>0;i--)
	        {
	        	
	        	if(num[i]-num[0]>0)
	        	{
	        		System.out.println(i);
	        		return i==num.length-1?num[0]:num[i+1];
	        	}
	        }
	        return num[num.length-1];
	    }
	 
	 public int findMin2(int[] num) {
		 if(num.length==1) return num[0];
	        for(int i=num.length-1;i>0;i--)
	        {
	        	
	        	if(num[i]<num[i-1])
	        		return num[i];
	        	
	        }
	        return num[0];
	    }
}
