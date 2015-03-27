
public class AddBinary {

	public static void main(String[] args) {
		AddBinary add=new AddBinary();
		//System.out.println((1^1));
		System.out.println(add.addBinary("1", "111"));
		//System.out.println("11110".substring(0,1));
		//相同输出0，不同输出1
	}
public String addBinary(String a, String b) {
        if(b.length()==0) return a;
		if(a.length()<b.length())
		{
			String temp=b;
			b=a;
			a=temp;
		}
		
        int ai=a.length()-1;
        int bi=b.length()-1;
        int temp;int both1=0;
        int carry=((a.charAt(ai)=='1')&&(b.charAt(bi)=='1'))?1:0;
        String res=(a.charAt(ai)^b.charAt(bi))+"";
        ai--;bi--;
        while(ai>=0)
        {
        	
        	if(bi>=0)
        	{
        		 temp=a.charAt(ai)^b.charAt(bi);
        		 both1=((a.charAt(ai)=='1')&&(b.charAt(bi)=='1'))?1:0;
        	}
        	else
        	{
        		temp=a.charAt(ai)^'0';
        	}
        	res=(temp^carry)+res;
        	if(temp==1&&carry==1)
        		carry=1;
        	else if(both1==1)
        	{
        		carry=1;
        		both1=0;
        	}	
        	else
        		carry=0;
        	
        	ai--;
        	bi--;
        }
        if(carry==1)
        	res=carry+res;
		return res;
        
    }
}
