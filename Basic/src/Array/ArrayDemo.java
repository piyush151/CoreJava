package Array;

public class ArrayDemo {

	public static void main(String []args)
	{
		//int arr[]= {10,20,30,40,50};
		
		//System.out.println(arr[0]);
		
		int arr[]=new int[] {10,20,30,40,50};
		
		/*for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		
		}*/
		
		for(int z:arr)
			System.out.println(z);
	
		String s="hello";
		
		System.out.println("Length of the string hello ="+s.length());
		
		System.out.println("length of the Array "+arr.length);
	}

}

