package selenium;

public class twodynamicarray {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][2];
		
		s[0][0]="Selenium";
		s[0][1]='M';
		s[1][0]=true;
		s[1][1]=20000;
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
				
			}
			
		}

	}

}
