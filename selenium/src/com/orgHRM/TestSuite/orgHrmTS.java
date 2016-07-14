package com.orgHRM.TestSuite;

import com.orgHRM.Master.orgMaster;

public class orgHrmTS {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		//login
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);

		om.org_Close();

		//empreg
		
		 	res=om.org_Launch(om.url);
			System.out.println(res);
			
			res=om.org_Login("Admin", "admin");
			System.out.println(res);
			
			res=om.org_Empreg("Sharath", "Chandra");
			System.out.println(res);
			
			res=om.org_Logout();
			System.out.println(res);

			om.org_Close();
			
			//userreg
			
			res=om.org_Launch(om.url);
			System.out.println(res);
			
			res=om.org_Login("Admin", "admin");
			System.out.println(res);
			
			res=om.org_Userreg("Sharath Chandra", "SharathChandra", "SharathChandra", "SharathChandra");
			System.out.println(res);
			res=om.org_Logout();
			System.out.println(res);

			om.org_Close();
			
			//user login
			
			res=om.org_Launch(om.url);
			System.out.println(res);
			
			res=om.org_Login("SharathChandra", "SharathChandra");
			System.out.println(res);
			
			res=om.org_Logout();
			System.out.println(res);

			om.org_Close();



	}

}
