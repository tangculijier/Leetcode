
public class intToRoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(intToRoman2(1));
		//I1  V5   X10  L50  C100  D500  M1000

	}
	
	public static String intToRoman(int num) {
		
		String result="";
		int qian=num/1000;
		int bai=(num%1000)/100;
		int shi=(num%100)/10;
		int ge=num%10;
		System.out.println(qian+" "+bai+" "+shi+" "+ge);
		for(int i=0;i<qian;i++)
			result+="M";
		if(bai<=3)
		{
			for(int i=0;i<bai;i++)
				result+="C";
		}
		else if(bai==4)
		{
			result+="CD";
			
		}
		else if(bai>=5&&bai<=8)
		{
			result+="D";
			for(int i=0;i<bai-5;i++)
				result+="C";
		}
		else
		{
		
			for(int i=0;i<10-bai;i++)
				result+="C";
			result+="M";
		}
		
		if(shi<=3)
		{
			for(int i=0;i<shi;i++)
				result+="X";
		}
		else if(shi==4)
		{
			result+="XL";
			
		}
		else if(shi>=5&&shi<=8)
		{
			result+="L";
			for(int i=0;i<shi-5;i++)
				result+="X";
		}
		else
		{
		
			for(int i=0;i<10-shi;i++)
				result+="X";
			result+="C";
		}
		
		if(ge<=3)
		{
			for(int i=0;i<ge;i++)
				result+="I";

		}
		else if(ge==4)
		{
			result+="IV";
			
		}
		else if(ge>=5&&ge<=8)
		{
			result+="V";
			for(int i=0;i<ge-5;i++)
				result+="I";
		}
		else
		{
			
			for(int i=0;i<10-ge;i++)
				result+="I";
			result+="X";
		}
		
		return result;
    }

	public static String intToRoman2(int num) {
		
		int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String result="";
		for(int i=0;i<values.length;i++)
		{
			while(num-values[i]>=0)
			{
				num-=values[i];
				System.out.println("num="+num);
				result+=roman[i];
			}
			
		}
		return result;
		
	}


}


