
public class ImplementstrStr {

	public static void main(String[] args) {
		ImplementstrStr x=new ImplementstrStr();
		System.out.println(x.strStr("mississippi", "issipib"));
		System.out.println(x.strStr("a", "a"));
	}
	   public int strStr(String haystack, String needle) {
		   int i,j;
		   for(i=j=0;i<haystack.length()&&j<needle.length();)
		   {
				if(haystack.charAt(i)==needle.charAt(j))
				{
					++i;
					++j;
				}
				else
				{
					i=i-j+1;
					j=0;
				}
		   }
		   //System.out.println(j);
		   return j!=needle.length()?-1:i-j;
		   
		   
	   }
}
