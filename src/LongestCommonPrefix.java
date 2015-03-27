import java.util.HashMap;
import java.util.Vector;


public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"abc","df","ff"}));
		HashMap map=new HashMap();
		Vector v=new Vector();
	}
	public static String longestCommonPrefix(String[] strs) {
			if(strs.length==0)return "";
			if(strs.length==1)return strs[0];
			String min=strs[0];

			for(int i=0;i<strs.length;i++)
				min=strs[i].length()<min.length()?strs[i]:min;

			boolean sameFlag=true;
			int index=0;
			while(index<min.length())
			{
				
				for(int i=0;i<strs.length;i++)
				{
					if(min.charAt(index)!=strs[i].charAt(index))
					{
						sameFlag=false;
						return min.substring(0,index);
					}
						
				}
				index++;
			}
			return min;
	        
	    }
}
