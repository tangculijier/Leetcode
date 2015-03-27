
public class CountandSay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countAndSay(5));
		System.out.println("111211211111221");

	}
	 public static String countAndSay(int n) {
		 if(n==0)return "";
		 if(n==1)return "1";
		 StringBuilder sb=new StringBuilder("111");
		 StringBuilder a=new StringBuilder("11");
		 for(int k=2;k<n;k++)
		 {
			 int i=0,temp=1;
			 StringBuilder b=new StringBuilder();
			 while(i<a.length()-1)
			 {
				 
				 if(a.charAt(i)==a.charAt(i+1))
				 {
					 temp++;
				 }
				 else{
					 b.append(temp);
					 b.append(a.charAt(i));
				 }
				 i++;
				 
				 if(i==a.length()-1)
				 {
					 b.append(temp);
					 b.append(a.charAt(i));
				 }
				 
				 System.out.println(b);
				 
			 }
			 a=b;
			 sb.append(b);
		 }
		return sb.toString();
	        
	    }
}
