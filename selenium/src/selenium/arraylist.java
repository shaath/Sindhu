package selenium;

import java.util.ArrayList;

public class arraylist 
{

	public static void main(String[] args)
	{
		ArrayList<Object> s=new ArrayList<Object>();
		
		//write data into arraylist 
		
		s.add("Selenium");
		s.add("Qtp");
		s.add(200000);
		s.add(true);
		
		//size of the arraiylist
		
		System.out.println(s.size());
		
		//read the values from arraylist
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
			
		}

	}

}
