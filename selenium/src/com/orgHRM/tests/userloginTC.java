package com.orgHRM.tests;

import com.orgHRM.Master.orgMaster;

public class userloginTC 
{
	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login("Sindhu12345", "Sindhu12345");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);

		om.org_Close();

		
	}

}
