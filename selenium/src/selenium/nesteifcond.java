package selenium;

public class nesteifcond
{
	public static void main(String[] args) 
	{
		int a=2000;
		int b=400;
		int c=60;
		
		if (a > b ) 
		{
			if (a > c) 
			{
				System.out.println("A is greater");
			}
			
		}
		else if (b > c & b > a) 
		{
			System.out.println("B is Greater");
		}
		else 
		{
			System.out.println("C is Greater");
		}
			

	}

}
