package selenium;

public class staticarray1 {

	public static void main(String[] args)
	{
		Object[] s={40000,"Selenium",'M',444.444,true};
		
		System.out.println(s.length);
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			
		}

	}

}
