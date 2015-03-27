import java.util.Stack;


public class MinStack {
	
	public static void main(String arg0[])
	{
		MinStack m=new MinStack();
		m.push(2);
		m.push(0);
		m.push(3);
		m.push(0);
		m.getMin();
		m.pop();
		
	}
	
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> minStack=new Stack<Integer>();
	public void push(int x) 
	{
		if(minStack.isEmpty())
		{
			minStack.push(x);
		}
		else if(!minStack.isEmpty()&&x<minStack.peek())
		{
			
			minStack.pop();
			minStack.push(x);
		}
			
	     stack.push(x);
	}
	
	    public void pop() {
	    	if (stack.peek().equals(minStack.peek()))  
	            minStack.pop(); 
	     if(!stack.isEmpty())
	    	 stack.pop();
	    }
	
	    public int top() {
	    	 return stack.peek();
	    }
	
	    public int getMin() {
	    	System.out.println(minStack.peek());
	        return  minStack.peek();
	    }
}
