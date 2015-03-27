
public class Decode {

	public static void main(String[] args) {
		Decode de=new Decode();
		System.out.println(de.decode("a2bc3d1fck3"));
		

	}

	private String decode(String str) {
		String word="";
		StringBuilder result=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			String temp=str.charAt(i)+"";
			if(temp.matches("[a-z]"))
			{
				result.append(temp);
				word+=temp;
			}
			else
			{
				int times=Integer.parseInt(temp)-1;
				for(int j=0;j<times;j++)
					result.append(word);
				word="";
			}
		}
		return result.toString();
		
	}

}
