
public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		MedianofTwoSortedArrays m=new MedianofTwoSortedArrays();
		int a[]={1,3,7,8};
		int b[]={2,4,5,6};
		System.out.println(m.findMedianSortedArrays(a, b));

	}
	public double findMedianSortedArrays(int A[], int B[]) {
        int m=A.length;
        int n=B.length;
        if(m==0&&n!=0)
        {
        	 if(n%2!=0)
    		 {
    			
    			 double d=B[n/2];
    			 return d;
    		 }
    		 else
    		 {
    			 return (B[n/2-1]+B[n/2])/2.0;
    		 }
        }
        
        if(n==0&&m!=0)
        {
        	 if(m%2!=0)
    		 {
    			
    			 double d=A[m/2];
    			 return d;
    		 }
    		 else
    		 {
    			 return (A[m/2-1]+A[m/2])/2.0;
    		 }
        }
        
        int cLength=m+n;
        int i=0,a=0,b=0;
        int[] c=new int[m+n];
        while(i<m+n)
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
            i++;
            
            if(a==m)
            {
            	int temp=b;
                for(int k=0;k<n-temp;k++)
                {
                    c[i++]=B[b++];
                }
                
            }
            
            if(b==n)
            {
            	int temp=a;
                for(int l=0;l<m-temp;l++)
                {
                    c[i++]=A[a++];
                }
                
            }
 
        }
        
        if(cLength%2!=0)
		 {
			
			 double d=c[cLength/2];
			 return d;
		 }
		 else
		 {
			 return (c[cLength/2-1]+c[cLength/2])/2.0;
		 }
    }
}
