
public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));

	}
	   public static boolean isPalindrome(String s) {
		   if(s.length()==0)return true;
	        String result="";
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)>64&&s.charAt(i)<122)
	        	{
	            
	        		result+=(s.charAt(i)+"").toLowerCase();
	        		System.out.println(result);
	        	}
	        }

	        for(int i=0,j=result.length()-1;i<j;i++,j--)
	        {

	        	if(result.charAt(i)!=result.charAt(j))
	        		return false;
	        }
	        
	        
	        return true;
   }
	   
	   public static boolean isPalindrome2(String s) {
		    if(s.length()==0)return true;
		    int i=0,j=s.length()-1;
		    while(i<j)
		    {
		    	while(s.charAt(i)<65||s.charAt(i)>122)
		    		i++;
		    		
		    	while(s.charAt(j)<65||s.charAt(j)>122)
		    		j--;
		    	System.out.println(s.charAt(i)+":"+s.charAt(j));
		    	
		    	if(!((s.charAt(i)+"").toLowerCase()).equals((s.charAt(j)+"").toLowerCase()))
		        		return false;
		    	i++;j--;
		    		
		    }
			return true;
		    
			   	
	        	
	        
		   
	   }
}
