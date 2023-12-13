
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo d=new MethodDemo();
		String a=d.getData();
		
		System.out.println(a);
		
		MethodDemo2 Demo2=new MethodDemo2();
		Demo2.getUserData();
		//System.out.println(Demo2.getUserData());
		getData2();
	}
	
	public String getData()
	{
		
		System.out.println("Hello my name is Punnam.B");
		return "Learning Selenium";
	}

	public static String getData2()
	{
		
		System.out.println("Hello my name is Punnam.B");
		return "Learning Selenium";
	}

}
