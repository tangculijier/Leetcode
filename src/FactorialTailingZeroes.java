
public class FactorialTailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(100));

	}

	 public  static int trailingZeroes(int n) 
	 {
        int count=0;
        while(n/5>=1)
        {
            count+=n/5;
            n/=5;
        }
        return count;
	  }
}
