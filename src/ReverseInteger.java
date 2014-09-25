
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverse2(1000000003));
		//System.out.println(Integer.MIN_VALUE-Integer.MAX_VALUE);
	}
	public static int reverse(int x) {
	        int res=0;
	        while(x!=0)
	        {
	        	res=res*10+x%10;
	        	x/=10;
	        }
	        return res;
	    }
	
	

	    public static int reverse2(int x) {
	        String str=x+"";
	        boolean isNeg=false;
	        if(str.charAt(0)=='-')
	        {
	            str=str.substring(1);
	            isNeg=true;
	        }
	            
	        //System.out.println(str);
	        char temp=0;
	        char[] arr=new char[str.length()];
	        
	        for(int i=0;i<str.length();i++)
	        {
	            arr[i]=str.charAt(i);
	        }
	        //System.out.println(Arrays.toString(arr));
	        for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
	        {
	            if(i<j)
	            {
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	        //System.out.println(Arrays.toString(arr));
	        
	        //System.out.println(Integer.parseInt(String.valueOf(arr)));
	        return isNeg==false?Integer.parseInt(String.valueOf(arr)):-Integer.parseInt(String.valueOf(arr));
	    
	}
}
