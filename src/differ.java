import java.util.ArrayList;

public class differ {

	public static void main(String[] args) {
		System.out.println(differ("abcde","abdefk"));
		System.out.println(differ("aba","aababb"));
		System.out.println(differ("abce","abcd"));
	}
	public static String differ(String a,String b)
	{
		String plus="";
		String neg="";
		ArrayList arr=new ArrayList();
		for(int i=0;i<a.length();i++)
		{
			arr.add(a.charAt(i));
		}
		for(int j=0;j<b.length();j++)
		{
			if(arr.indexOf(b.charAt(j))!=-1)
				arr.remove(arr.indexOf(b.charAt(j)));//说明有
			else
				plus+=",+"+b.charAt(j);
		}
		for(int i=0;i<arr.size();i++)
			neg+="-"+arr.get(i);
		if(neg=="")
			plus=plus.substring(1);//去掉逗号
		return neg+plus;
	}
	
}
