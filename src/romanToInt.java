
public class romanToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(romanToInt("MDCCCXCIX"));
	}
	 public static int romanToInt(String s) {
		 if(s.length()==0) return 0;
		 int result=0;
		 int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i=0;i<roman.length;i++)
		{
			System.out.println(s.indexOf(roman[i]));
			while(s.indexOf(roman[i])==0)
			{
				result+=values[i];
				System.out.println(result);
				s=s.substring(roman[i].length());
				System.out.println(s);
			}
		}
			
		 return result;
	        
	   }
}
