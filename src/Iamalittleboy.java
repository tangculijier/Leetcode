
public class Iamalittleboy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char str[]={' ',' ',' ','i',' ','a','m',' ','a',' ',' ','l',' '};
		conver(str,13);
	}
	private static void conver(char str[],int len)
	{
		for(int i=0;i<len-1;i++)
		{
			if(str[i]==str[i+1])
			{
				System.out.println(str[i]+"|");
				for(int j=i;j<len-1;j++)
				{
					str[j]=str[j+1];
				}
				len--;
			}
		}
		
		for(int i=0;i<len-1;i++)
		{
			str[i]=str[i+1];
		//	System.out.print(str[i]);
		}
		len=len-2;
		for(int i=0;i<len;i++)
		{
			
			System.out.print(str[i]);
		}
		System.out.print("|");
	}
}
