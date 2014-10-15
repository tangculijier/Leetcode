import java.util.Arrays;


public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1};
		System.out.println(removeElement2(a,1));

	}
	
	public static int removeElement2(int[] A, int elem) {
		if(A.length==0) return 0;
		int j=A.length-1;
		int i=0;
		while(i<A.length)
		{
			if(A[i]==elem)
			{
				while(j>=i&&A[j]==elem)
				{
					j--;
				}
				if(j>=i)
				{
					A[i]=A[j];
					j--;
				}
			}
			else
				;
			i++;
		}
		
		if(j==-1)
			return 0;
		else
			A=Arrays.copyOf(A, j+1);
		
		System.out.println(Arrays.toString(A));
		return A.length;
	}
}
