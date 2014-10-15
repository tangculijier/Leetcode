import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PolanToNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		String str="345+*612+/-";
		int result=0;
		for(int i=0;i<str.length();i++)
		{
			String ch=str.charAt(i)+"";
			Pattern pattern = Pattern.compile("[0-9]");
	        Matcher isNum = pattern.matcher(ch);
	        if(isNum.matches())//如果是数字  压栈
	        {
	        	stack.push(ch);
	        	System.out.println(stack.peek());
	        }
	        else
	        {
	        	int pop1=Integer.parseInt(stack.pop());
	        	int pop2=Integer.parseInt(stack.pop());
	        	switch(ch)
	        	{
	        	case "+":result=pop2+pop1;
	        			stack.push(result+"");
	        			break;
	        	case "-":result=pop2-pop1;
	        			stack.push(result+"");
    					break;
	        	case "*":result=pop2*pop1;
	        			stack.push(result+"");
    					break;
	        	case "/":result=pop2/pop1;
	        			stack.push(result+"");
    					break;
	        		
	        	}
	        }

		}
		System.out.println("result="+result);
	}
	
}


