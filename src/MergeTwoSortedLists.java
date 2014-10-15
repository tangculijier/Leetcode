
public class MergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	 {
		 if(l1==null||l2==null) return null;

		 ListNode c1=l1;
		 ListNode c2=l2;
		 ListNode p=l1;
		 if(l1.val>l2.val)
		 {
			 c1=l2;
			 c2=l1;
			 p=l2;
		 }
		 
		 while(true)
		 {
			 if(c1.val>c2.val)
			 {
				 if(p==l1||p==l2)
					 p=l2;
				 else
				 p.next=c2;
				 p=c2;
				 if(c2.next!=null)
					 c2=c2.next;
					 else
					 {
						 while(c1!=null)
						 {
							 p.next=c1;
							 c1=c1.next;
							 
						 }
						 
						 break;
					 }
			 }
			 else
			 {
				 if(p==l1||p==l2)
					 p=l1;
				 else
				 p.next=c1;
				 p=c1;
				 if(c1.next!=null)
					 c1=c1.next;
					 else
					 {
						 while(c2!=null)
						 {
							 p.next=c2;
							 c2=c2.next;
							 
						 }
						 
						 break;
					 }
				 
			 }
		 }
		 
		 
			 
		return l1;
	 }
class ListNode 
{
     int val;
      ListNode next;
     ListNode(int x) 
     {
          val = x;
          next = null;
     	
     }
}

}
