import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SingleNumber_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={-1,-1,1,6,6,3,3,4,4,4,424,3,1,5,1,5,5,-1,6};
		System.out.println(singleNumber(a));
//		System.out.println();
//		System.out.println(0^1);
//		System.out.println(0^1^1);
//		System.out.println(0^1^1^1);

	}

	public static int singleNumber(int[] arr) {
    	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<arr.length;i++)
    	{
    		if(!map.containsKey(arr[i]))
    			map.put(arr[i], 1);
    		else
    			map.put(arr[i], (map.get(arr[i]))+1);
    		
    	}

    	for(int i=0;i<arr.length;i++)
    	{
    		if(map.get(arr[i])==1)
    			return arr[i];
    	}
        return 0;
    }
    
	
	// Òì»ò
//    public static int singleNumber(int[] A) {
//    	Arrays.sort(A);
//    	System.out.println(Arrays.toString(A));
//        int res = 0;
//        for (int i=0;i<A.length;i++) 
//        {
//        	if(i>1&&res==0)
//                i++;
//            res ^= A[i];
//            System.out.println(res);
//            
//        }
//        return res;
	
	
	
//    }
    


}
