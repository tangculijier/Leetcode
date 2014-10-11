import java.util.ArrayList;


public class MathString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i=0;i<10;i++)
		{
			int temp=(int) (Math.random()*26+65);
			System.out.print((char)temp+"");
		}
		
		ArrayList a=new ArrayList();
		a.add(1);
		System.out.println(a.set(0, 2));
		a.ensureCapacity(5);
		System.out.println(a.size());
		System.out.println(a.get(0));
	}

}
