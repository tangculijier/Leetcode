
public class QuareFirstProblem {

	public static void main(String[] args) {
		QuareFirstProblem q=new QuareFirstProblem();
		//int[] arr={1,5,6,7,8,9,12,33,45,67,878};
		//int[] arr={33,45,67,878,1,5,6,7,8,9,12};
		int[] arr={9,10,11,0,1,2,3,4,5,6,7,8};
		System.out.println(q.find2(arr,0));

	}

	private int find(int[] arr, int target) 
	{
		int left=0;
		int right=arr.length;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(arr[mid]<target)//go right
				left=mid+1;
			else if(arr[mid]>target)// go left
				right=mid-1;
			else if(arr[mid]==target)
				return mid;

		}
		return -1;
	}

	
	int find2(int[] arr,int target)
	{
		int left=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		if(arr[mid]>arr[left])
		{
			
		}
		else //[9,10,11,0,1,2,3,4,5,6,7,8]  2>9Ϊ�� ����[2,3,4,5,6,7,8]�ⲿ������
		{
			if(target>=arr[mid]&&target<=arr[right])//˵��Ҫ�ҵ�������[2,3,4,5,6,7,8]����
				return binarySearch(arr, mid, right, target);//���ⲿ�ֽ��ж��ֲ���
			else
				return binarySearch(arr, left, mid-1, target);
				
		}
		return target;
		
	}
	static int binarySearch(int arr[],int low,int high,int value)  //���ֲ���
    {
        if(low>high)
            return -1;

        int mid=(low+high)/2;

        if(value==arr[mid])
            return mid;
        else if(value>arr[mid])
            return binarySearch(arr,mid+1,high,value);
        else
            return binarySearch(arr,low,mid-1,value);
    }
}
