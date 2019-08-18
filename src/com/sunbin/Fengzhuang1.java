package com.sunbin;

public class Fengzhuang1
{
	//µÚÊ®½²
	/*
	int age = 20;
	
	public static void main(String[] args)
	{
	Fengzhuang1 fengzhuang1 = new Fengzhuang1();
	System.out.println(fengzhuang1.age);
	}
		*/
	
	int age = 20;
	
	public void change(Fengzhuang1 fengzhuang1)
	{
		fengzhuang1 = new Fengzhuang1();
		
		fengzhuang1.age = 30;
	}
	
	public static void main(String[] args)
	{
		Fengzhuang1 fengzhuang1 = new Fengzhuang1();
		
		int age = fengzhuang1.age;
		
		System.out.println(age);
		
		fengzhuang1.change(fengzhuang1);
		
		int age2 = fengzhuang1.age;
		
		System.out.println(age2);
				//public
	}
}
