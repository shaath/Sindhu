package selenium;

public class stringops 
{

	public static void main(String[] args) 
	{
		String name="Sindhu";
		
		int length=name.length();
		System.out.println(length);
		
//		char c=name.charAt(4);
//		System.out.println(c);
		
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
//		System.out.println(name.charAt(3));
//		System.out.println(name.charAt(4));
//		System.out.println(name.charAt(5));
		
		
//		System.out.println(name.substring(2, 5));
		
		if (name.contains("nh")) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
