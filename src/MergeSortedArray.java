import java.util.Arrays;


public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={1};
		int[] b={2};

		merge(a,a.length,b,b.length);
	}
	 private static void merge(int A[], int m, int B[], int n) {
		  if(n==0)return ;
			 if(m==0)    
			 {
			    for(int i=0; i<n; i++)
	               A[i] = B[i];
			     return;
			 }
	         int[] c=new int[m+n];
			 int a=0,b=0;
			 for(int i=0;i<c.length;i++)
			 {
				 if(a<m&&b<n)
				 {
					 if(A[a]<B[b])
					 {
						 c[i]=A[a];
						 a++;
					 }
					 else 
					 {
						 c[i]=B[b];
						 b++;
					 }
				 }
				 else if(b>=n&&a<=m-1)
				 {
					 c[i]=A[a];
					 a++;
				 }
				 else if(a>=m&&b<=n-1)
				 {
					 c[i]=B[b];
					 b++;
				 }
				 else
					 c[i]=a>b?B[b]:A[a];
							 
				 
			 }

			 		 A=c;
		    
		 System.out.println(Arrays.toString(A));
		 
	    }
}
