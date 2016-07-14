package selenium;

public class twodimeg {

	public static void main(String[] args) 
	{
		int[][] s=new int[2][5];
		
		//finding the number of rows
		System.out.println(s.length);
		
		//finding the columns length
		
		System.out.println(s[1].length);
		
		//write the values into array
		
		s[1][0]=40000;
		
		s[0][4]=60000;
		
		s[1][2]=40000;
		
		//read the values
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
				
			}
			
		}
		

	}

}
