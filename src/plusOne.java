
public class plusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,9,8,99};
		plusOne(a);

	}
	 public static int[] plusOne(int[] d) {
		 boolean jinwei=false;
		 int i=d.length-1;
		 	while((d[i]+1)%10==0)
		 	{
		 			System.out.println("jinwei");
		 			jinwei=true;
		 			i--;
		 	}	
		 	
		 	if(jinwei==true)
		 	{
		 		
		 	}
		 	
	        return d;
	    }
}
