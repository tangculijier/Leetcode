import java.util.Arrays;


public class plusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={3,4};
		System.out.println(Arrays.toString(plusOne3(a)));


	}
	 public static int[] plusOne(int[] digits) {
		 int i=digits.length-1;
		 while(i>0)
		 {
			 if(digits[i]+1==10)
			 {
				 digits[i]=0;
				 i--;
				 digits[i]+=1;
			 }
			 else
			 {
				 digits[i]+=1;
				 return digits;
			 }
				
		 }
		 if(i==0)
		 {
			 System.out.println("È«ÊÇ99");
		 }
		return digits;
	        
	    }
	
	 public static int[] plusOne2(int[] digits) {
		 	long res=0;
	        int length=digits.length;
	        for(int i=length-1;i>=0;i--)
	        {
	            res+=digits[i]*(Math.pow(10,length-i-1));
	        }
	        res+=1;
	        int c[]=new int[(res+"").length()];
	        for(int j=c.length-1;j>=0;j--)
	        {
	            c[j]=(int) (res%10);
	            res/=10;
	        }
	        return c;
	 }
	 public static int[] plusOne3(int[] digits) {
		 int length=digits.length;
			 int i=length-1;
			 while(i>=0&&digits[i]==9)
			 {
				 digits[i]=0;
				 i--;
			 }
			 if(i==-1)
			 {
				 int[] c=new int[length+1];
				 c[0]=1;
				 return c;
			 }else
			 {
				 digits[i]+=1;
				 return digits;
			 }
		 
		 
		 
	 }
}
