package selenium;

import java.util.Scanner;

public class ifcond {

	public static void main(String[] args) 
	{
//		int A=300000;
//		int B=40000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value");
		int A=sc.nextInt();
		System.out.println("Enter B vlaue");
		
		int B=sc.nextInt();
		
		if (A > B) 
		{
			System.out.println("A is Greater");
		}
		
		
		

	}

}
