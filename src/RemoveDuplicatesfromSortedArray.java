import java.util.Arrays;


public class RemoveDuplicatesfromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,1,1,1,2,2,2};
		System.out.println(removeDuplicates2(a));
	}
	private static int removeDuplicates(int[] A) {
        if(A.length==0)return 0;
        int i=0;int j=1;
        int temp=A[0];
        while(i<A.length)
        {
        	while(A[i]==temp&&i<A.length)
        	{
        		if(i==A.length-1)break;
        		i++;
        	}
        	if(i!=A.length-1)
        	{
        		temp=A[i];
        		A[j++]=A[i++];
        	}
        	else
        	{
        		if(A[i]==temp)
        		{
        			j--;
        			i++;
        		}		
        		else
        			A[j]=A[i++];
        	}
        	
        }
        A=Arrays.copyOf(A, j+1);
        System.out.println(Arrays.toString(A));
        return j+1;
    }
	
	private static int removeDuplicates2(int[] A) {
		int index=1;
		for(int i=1;i<A.length;i++)
		{
			if(A[i]!=A[i-1])
			{
				A[index++]=A[i];
			}
		}
		
		  A=Arrays.copyOf(A, index);
	        System.out.println(Arrays.toString(A));
		return index;
		
		
	}
	
}
