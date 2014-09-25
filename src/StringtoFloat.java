import java.util.Arrays;


public class StringtoFloat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="-1234.353415";
		System.out.println(Float.parseFloat(str));
		String [] arr=new String[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i)+"";
		}
		
		System.out.println(Arrays.toString(arr));

		if(arr[0].equals("+")||arr[0].equals("-"))
		{
			
			
		}
			
		int j=0;
		while(!arr[j].equals("."))
		{
			j++;
		}
		if(arr[0].equals("+")||arr[0].equals("-"))
			j--;
	
		
	}

}
