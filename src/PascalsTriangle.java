import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PascalsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		generate(5);

	}
	 private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> l=new ArrayList<List<Integer>>();
		if(numRows==0) return l;
		List<Integer> first=new ArrayList<Integer>();
		first.add(1);
		l.add(first);

		for(int i=1;i<numRows;i++)
		{
			List<Integer> list=new ArrayList<Integer>();
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)
					list.add(1);
				else
					list.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
	
			}
			l.add(list);
		}
		System.out.println(l.get(4));
		return l;
	
	 }
	
}
