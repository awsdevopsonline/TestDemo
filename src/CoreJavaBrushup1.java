
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("Hello World "+ num);
		
		int[] arr= {1,2,4,5,6};
		System.out.println(arr[0]);
		

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name= {"Punnam","Sony","Dhruva","Goud"};
		
		for(int i = 0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s:name)
		{
			
			System.out.println(s);
		}
	}

}
