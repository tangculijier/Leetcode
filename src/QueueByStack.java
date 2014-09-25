import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;


public class QueueByStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack_ s=new Stack_();
		s.pushQueue(1);
		s.pushQueue(2);
		s.pushQueue(3);
		s.diplay();
		s.outQuque();
		s.diplay();
		s.pushQueue(4);
		s.diplay();
		s.outQuque();
		s.outQuque();
		s.outQuque();
		s.outQuque();
		s.outQuque();
		s.diplay();
	}

	
	
	
}
class Stack_
{
		Stack s1=new Stack();
		Stack s2=new Stack();
		
		public void pushQueue(int data)
		{
			
			s1.push(data);
			
			
		}
		
		public void outQuque()
		{
			while(!s1.isEmpty())
			{
				 
				s2.push(s1.pop());
				
			}
			
			diplay();
			if(!s2.isEmpty())
			s2.pop();
			
			
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
			
		}
		
		public void diplay()
		{
			System.out.println("s1-------");
				System.out.println(s1);
			
			System.out.println("s2-------");
				System.out.println(s2);
			System.out.println("--------display---------");
			
		}
		
		
}