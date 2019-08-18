package com.shierdaoshiba;

public class Yunsuan
{
	/*
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		*/
		/*
		逻辑与：使用&&表示，逻辑与是个双目运算符（即有两个操作数的运算符），只有
		当两个操作数都为真的时候，结果才为真；其余情况结果均为假。逻辑与表示的并
		且的意思。
		boolean e = (a > b) && (c < d);
		System.out.println(e);
		*/
	
		/*
		逻辑或：使用||表示，逻辑或也是个双目运算符，只有当两个操作结果才为假；
		其余情况结果均为真。逻辑或表示或者的意思。
		boolean e = (a > b) || (c > d);
		System.out.println(e);
		*/
		/*
		public static void main(String[] args)
		{
			int a = 3;
			int b = 2;
			
			boolean c = (a != b);

			System.out.println(c);
		}
		*/
	public static void main(String[] args)
	{
		int a = 3;
		//a = a + 1;

		//a += 1; // 等价于 a = a + 1;

		//a++;

		//++a;

		//a = a + 2;
		//a += 2;

		int b = ++a;

		a++;
		--a;
		--a;

		System.out.println(a);
		System.out.println(b);
	}
	
	}
	

