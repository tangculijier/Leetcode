class ListNode
{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class LinkedListCycle {


	public static void main(String[] args) {
		ListNode n0=new ListNode(0);
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		
		n0.next=n1;
		n1.next=n2;
	//	n2.next=n1;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n6;
		//display(n0);
		
		System.out.println(hasCycle(n0)); 

	}
	
	 public static boolean hasCycle(ListNode head) 
	 {
		 ListNode slow=head;
		 ListNode fast=head;
		 if(head==null)return false;
		 while(fast.next!=null)
		 {
			 if(fast.next.next==null)return false;
			 slow=slow.next;
			 fast=fast.next.next;	 
			 if(slow==fast)return true;
		 }
		 return false;
	  
	 }
	
}
