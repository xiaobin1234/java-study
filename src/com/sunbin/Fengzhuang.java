package com.sunbin;

public class Fengzhuang
{	
	//���巽����
	
	//����������ӵķ���
	public int add(int a,int b)
	{
		return a + b;
	}
	
	//������������ķ���
	public int subtrace(int a,int b)
	{
		return a - b;
	}
	
	//����������˵ķ���
	public int multiply(int a,int b)
	{
		return a * b;
	}
	
	//������������ķ���
	public int divide(int a,int b)
	{
		return a / b;		
	}
	
	//ʹ��void�ؼ��ֱ�ʾ����������ֵ	
	public void method(int a)
	{
		if(a <10)
		{
			return;
		}
		System.out.println("Hello sunbin"); 
	}
	
	//���÷���
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
			//�ھŽ�
	}
}
