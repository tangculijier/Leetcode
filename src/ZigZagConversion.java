
public class ZigZagConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",3));
		System.out.println("PAHNAPLSIIGYIR");

	}
	 public static String convert(String s, int nRows) {
		 	int length=s.length();
			if(length==0)return "";
			if(nRows==1) return s;
			
		 	int period=2*nRows-2;
		 	StringBuilder sb=new StringBuilder();
		 	for(int i=0;i<nRows;i++)
		 	{
		 		for(int j=i;j<s.length();j+=period)
		 		{
		 			sb.append(s.charAt(j)+"");
		 			if(i!=0&&i!=nRows-1)
		 			{
		 				int temp=j+period-2*i;
		 				if(temp<s.length())
		 				sb.append(s.charAt(temp)+"");
		 			}
		 		}
		 	}
			return sb.toString();
			 
			 
			 
		 }
	/*
	 public static String convert(String s, int nRows) {
		 int length=s.length();
		 if(length==0)return "";
		 if(nRows==1) return s;
		 String[][] arr=new String[nRows][length];
		 int i=0,j=0,k=-1;
		 boolean isUp=true;
		 while(i<length)
		 {
			 if(j==0)
			 {
				 isUp=true;
				 k++;
			 }
				
			 else if(j==nRows-1)
			 {
				 isUp=false;
				 k++;
			 }
				
			 
			 if(isUp)
				 arr[j++][k]=s.charAt(i++)+"";
			 else
				 arr[j--][k]=s.charAt(i++)+"";
		 }
		 
		 StringBuilder sb=new StringBuilder();
		 for(int m=0;m<arr.length;m++)
		 {
			 for(int n=0;n<arr[m].length;n++)
			 {
				 if(arr[m][n]!=null)
				sb.append(arr[m][n]);
			 }
		 }
		return sb.toString();
	        
	 }
	 */
	
}
