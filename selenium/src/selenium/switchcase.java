package selenium;

public class switchcase {

	public static void main(String[] args)
	{
		String course="Coded UI";
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		
		case "UFT":
			System.out.println("You are selected UFT");
			break;
			
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "Loadrunner":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Selct a proper option");
			break;
		}

	}

}
