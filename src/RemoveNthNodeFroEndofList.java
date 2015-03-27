



public class RemoveNthNodeFroEndofList {

	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
		System.out.println(removeNthFromEnd(l1,1).val);
		//System.out.println(l3.next.val);

	}
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode returnNode=new ListNode(0);
		 if(head==null) return returnNode;
		 if(n>=1&&head.next==null) return null;
		 ListNode fast=head;
		 ListNode slow=head;
		 ListNode pre=returnNode;
		 returnNode.next=head;
		 while((n--)>0)
		 {
			 fast=fast.next;
		 }
		 while(fast!=null)
		 {
			 pre=slow;
			 slow=slow.next;
			 fast=fast.next;
		 }
		 
			 pre.next=slow.next;
		return returnNode.next;
	        
	    }
	 
	 public static  ListNode removeNthFromEnd2(ListNode head, int n) {  
	        if(head==null)return null;  
	        ListNode dummy=new ListNode(0);  
	        ListNode fast = head;  
	        ListNode low = head;  
	        ListNode pre = dummy;  
	        dummy.next=head;  
	        while((n--)>0){  
	            fast=fast.next;  
	        }  
	        while(fast!=null){  
	            fast=fast.next;  
	            pre = low;  
	            low=low.next;  
	        }  
	        pre.next=low.next;  
	        return dummy.next;  
	    }  
	 
	   public static ListNode removeNthFromEnd3(ListNode head, int n) {  
	        if(n == 0 || head == null){  
	            return head;  
	        }  
	        if(n == 1 && head.next==null){  
	            return null;  
	        }  
	           
	        ListNode p = head, q = head;  
	        // 让p先行q n个位置  
	        for(int i=0; i<n; i++){  
	            if(p != null){  
	                p = p.next;  
	            }else{  
	                return head;  
	            }  
	        }  
	           
	        // 如果这个时候p已经是null，则说明删除的必定为head  
	        if(p == null){  
	            head = head.next;  
	            return head;  
	        }  
	           
	        // p和q一起前进  
	        while(p.next != null){  
	            q = q.next;  
	            p = p.next;  
	        }  
	        // 删除元素  
	        q.next = q.next.next;  
	        return head;  
	    } 
}
