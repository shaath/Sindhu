package selenium;

public class reversestring {

	public static void main(String[] args) 
	{
		String original="Sharath";
		
		int len=original.length();
		
		for (int i = len-1; i >= 0; i--)
		{
			char reverse=original.charAt(i);
			
			System.out.print(reverse);
			
			
		}
		System.out.println();

	}

}
