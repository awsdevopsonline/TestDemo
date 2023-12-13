import java.util.ArrayList;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,5,61,100,121,1450};
		//muntiple by 2
		
		//check if array has multiples of 2
		for(int i:arr)
		{
			if(i%2==0)
			{
				System.out.println(i);
				//break;
			}
			
			else
			{
				System.out.println(i+"Not mul of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Dhruva");
		a.add("Sony");
		a.add("Punnam");
		a.add("Selenium");
		//a.remove(3);
		System.out.println(a.get(3));
		
		//String Methods
		
		String s="RAhul Shetty Academy";
		String[] splitstring= s.split("Shetty");
		System.out.println(splitstring[0]);
		System.out.println(splitstring[1]);
		//System.out.println(splitstring[2]);
		System.out.println(splitstring[0].trim());
		System.out.println(splitstring[1].trim());
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			
		}
		
		}
	}


