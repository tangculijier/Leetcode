import java.util.ArrayList;
import java.util.List;


public class PopulatingNextRightPointersinEachNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeLinkNode t1=new TreeLinkNode(1);
		TreeLinkNode t2=new TreeLinkNode(2);
		TreeLinkNode t3=new TreeLinkNode(3);
		TreeLinkNode t4=new TreeLinkNode(4);
		TreeLinkNode t5=new TreeLinkNode(5);
		TreeLinkNode t6=new TreeLinkNode(6);
		TreeLinkNode t7=new TreeLinkNode(7);
		t1.left=t2;t1.right=t3;
		t2.left=t4;t2.right=t5;
		t3.left=t6;t3.right=t7;
		TreeLinkNode current=t1;

		connect(t1); 
			//System.out.println(t4.left.val);

			
	}
	
	  public  static void connect(TreeLinkNode root) {
		  if(root!=null) 
		  {
		  TreeLinkNode current=root;
		  TreeLinkNode first=root;
		  List<TreeLinkNode> list=new ArrayList<TreeLinkNode>();
		  while(current!=null)
		  {
			 if(current.left!=null)
				 list.add(current.left);
			 if(current.right!=null)
				 list.add(current.right);
			 
			 if(current.next!=null)
				 current=current.next;
			 else
				 break;

		  }
		  for(int i=0;i<list.size()-1;i++)
		  {
			  System.out.println(list.get(i).val);
				 list.get(i).next=list.get(i+1);
		  }
		  
		  if(first.left!=null)
		  connect(first.left);
		  }
	    }

}
class TreeLinkNode 
{
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
}