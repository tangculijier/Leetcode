
public class padStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(padStart("2010",3,'0'));
		System.out.println(padStart("7",5,'0'));
		System.out.println(padStart("0",0,'g'));

	}
	
	public static String padStart(String str,int m,char c)
	{
		str=str.trim();
		if(str.length()==0&&m>0)
		{
			for(int i=0;i<m;i++)
			{
				str=c+str;
			}
		}
		else if(str.length()>=m)
		{
			return str;
		}
		else
		{
			while(str.length()<m)
				str=c+str;
			return str;

		}
		return str;
	}
}
