
public class singleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,-1,3,3,4,1,5,5,-1,6};
		System.out.println(singleNumber(a));
		System.out.println(0^1);
		System.out.println(0^1^-1);
		System.out.println(0^1^-1^3);

	}

	// “ÏªÚ
    public static int singleNumber(int[] A) {
        int res = 0;
        for (int i : A) {
            res ^= i;
        }
        return res;
    }
    

}
