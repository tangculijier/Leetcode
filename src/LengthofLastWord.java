
public class LengthofLastWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   char c = '\u0001';
	        System.out.println(c);
		char[] chars = new char[20];
		chars[0] = '\u0000';
		chars[1] = '\u0001';
		chars[2] = '\u0002';
		chars[3] = '\u0003';
		chars[4] = '\u0004';
		chars[5] = '\u0005';
		chars[6] = '\u0006';
		chars[7] = '\u0007';
		chars[8] = '\u0008';
		chars[9] = '\u0009';
		chars[10] = '\u0010';
		chars[11] = '\u0012';
		chars[12] = '\u0013';
		chars[13] = '\u0014';
		chars[14] = '\u0015';
		chars[15] = '\u0016';
		chars[16] = '\u0017';
		chars[17] = '\u0018';
		chars[18] = '\u0019';
		chars[19] = '\u0020';

		for (int i = 0; i < chars.length; i++) {
		System.out.print("(" + i + ")" + chars[i] + "    ");
		if (i != 0 && i % 5 == 0) {
		System.out.println();
		}
		}
		
		
		
		System.out.println(lengthOfLastWord("Length of Last Wordd  "));
	}
	 private static int lengthOfLastWord(String s) {
		 	if(s.length()==0)return 0;
		 	s=s.trim();
	        int last=s.lastIndexOf(" ")+1;
	        System.out.println(last);

	        return s.length()-last;
	    }
}
