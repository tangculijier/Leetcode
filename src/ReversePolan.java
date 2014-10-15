import java.util.Stack;


public class ReversePolan {

	/**
	 * @param args
	 */
	static Stack<String> stack=new Stack<String>();
	static String result="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="A*B+C";
		String a2="A*(B+C)";
		String a3="A*B+C*D";
		String a4="(A+B)*(C-D)";
		String a5="((A+B)*C)-D";
		String a6="A+B*(C-D/(E+F))";
		System.out.println(toPolan(a1));
		System.out.println(toPolan(a2));
		System.out.println(toPolan(a3));
		System.out.println(toPolan(a4));
		System.out.println(toPolan(a5));
		System.out.println(toPolan(a6));
	}

	static String toPolan(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			switch(ch)
			{
				case '+':
				case '-':
						bijiao(ch+"",1);
						break;
				case '*':
				case '/':
						bijiao(ch+"",2);
						break;
				case '(':
						stack.push("(");
						break;
				default:
					result+=ch+"";
			
			}
		}
		return result;
	}
	
	static void bijiao(String ch,int range)
	{
		String top;
		while(!stack.isEmpty())
		{
			 top=stack.pop();
			 if(top.equals("("))
			 {
				 stack.push(top);
				 break;
			 }
			 else
			 {
				 int p2;
				 if(top.equals("+")||top.equals("-"))
					 p2=1;
				 else//* /
					 p2=2;
				 
				 if(p2<range)//ËµÃ÷ÊÇ+ -
				 {
					 stack.push(ch+"");
					 break;
				 }
				 else
				 {
					 result+=top;
				 }
				 
			 }
			 
		}
	}
	
}
