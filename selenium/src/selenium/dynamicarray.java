package selenium;

public class dynamicarray {

	public static void main(String[] args)
	{
		String[] sal=new String[5];
		
		System.out.println(sal.length);
		
		//write the values into array
		
		sal[1]="Selenium";
		sal[3]="QTP";
		
		for (int i = 0; i < sal.length; i++) 
		{
			System.out.println(sal[i]);
			
		}
		
		
		
		

	}

}
