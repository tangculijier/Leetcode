import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Command_name_Lily {

	/**
	 * @param args
	 * @throws IOException 
	 * -name Lily -age 21  -school "University of Oxford"
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//System.out.println(str);
		String[] result=new String[10];
		//System.out.println(Arrays.toString(result));
		analyse(str);
		
	}
	
	public static String analyse(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='-')
			{
				String[] arr=str.split("-");
				for(int j=0;j<arr.length;j++)
					System.out.println(arr[j]);
			}
		}
		
		
		return str;
		
	}
}
