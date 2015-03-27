import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome(1000021));
	

	}
		public static boolean isPalindrome(int x) {
			 if(x<0)return false;
				while(x>=10)
				{
					int first=(int) (x/Math.pow(10, (x+"").length()-1));
					int last=x%10;
					System.out.println(first+" "+last);
					if(first==last)
					{
						//System.out.println((int)(first*Math.pow(10, (x+"").length()-1)));
						//System.out.println(last);
						//System.out.println(x);
						System.out.println((first)*(int)Math.pow(10,(x+"").length()-1));
						x=x-(int)((first)*(int)(Math.pow(10, (x+"").length()-1)));
						System.out.println(x);
						x=(int)((x-(int)(first*Math.pow(10, (x+"").length()-1))-last))/10;
						//System.out.println(x);
					}
					else
						return false;
				}
			
				return true;
		        
		 }
		 	
}
