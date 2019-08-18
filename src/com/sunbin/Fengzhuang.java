package com.sunbin;

public class Fengzhuang
{	
	//定义方法：
	
	//两个整数相加的方法
	public int add(int a,int b)
	{
		return a + b;
	}
	
	//两个整数相减的方法
	public int subtrace(int a,int b)
	{
		return a - b;
	}
	
	//两个整数相乘的方法
	public int multiply(int a,int b)
	{
		return a * b;
	}
	
	//两个整数相除的方法
	public int divide(int a,int b)
	{
		return a / b;		
	}
	
	//使用void关键字表示方法不返回值	
	public void method(int a)
	{
		if(a <10)
		{
			return;
		}
		System.out.println("Hello sunbin"); 
	}
	
	//调用方法
	public static void main(String[] args)
	{
		Fengzhuang fengzhuang = new Fengzhuang();
		
			int x = 9;
			int y = 3;
			
			int a = fengzhuang.add(x,y);
			int b = fengzhuang.subtrace(x,y);
			int c = fengzhuang.multiply(x,y);
			int d = fengzhuang.divide(c,y);
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			int m = 10;
			
			fengzhuang.method(m);
			//第九讲
	}
}
