package com.orgHRM.Master;

public class basicfunctions 
{
	public static int a;

	public static void main(String[] args) 
	{
		function1();
		a=40;
		String res=function2();
		System.out.println(res);
		basicfunctions f=new basicfunctions();
		
		f.function3();
		
		res=f.function4();
		System.out.println(res);
	}
	
	//static function without returning value
	
	public static void function1()
	{
		a=50;
		System.out.println("This is function1 code");
	}
	//static function with returning value

	public static String function2()
	{
		a=60;
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//non static function without returning any value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//non staatic function with returning value
	
	public String function4()
	{
		System.out.println("This is function4 code");
		return "Fail";
	}
	
	
}
