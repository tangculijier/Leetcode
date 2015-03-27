import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class MajorityElement {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,5,2,2,2,2,2};
		System.out.println(majorityElement2(a));

	}

	public static int majorityElement(int[] num) {
	        if(num.length==0) return 0;
	        Arrays.sort(num);
	        return num[num.length/2];
	}
	public static int majorityElement2(int[] num) {
        int counter=1;
        int target=num[0];
        for(int i=1;i<num.length;i++)
        {
        	if(target==num[i])
        		counter++;
        	else
        		counter--;
        	if(counter==0)
        	{
        		target=num[i];
        		counter=1;
        	}
        	
        }
        return target;
}
}
