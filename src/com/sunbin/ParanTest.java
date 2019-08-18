package com.sunbin;

import java.security.Permissions;

import javax.sound.midi.SysexMessage;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ParanTest
{	
	/*  第十一讲
	public static void main(String[] aegs)
	{
		Person person = new Person();
		
		person.change(person);
		
		int age = person.age;
		
		System.out.println(age);
		
		System.out.println("--------------");
		
		int a = 10;
		
		person.change2(a);
		
		System.out.println(a);
	}
}

class Person
{
	int age = 20; 
	 
 public void change(Person person)
 
	{
		person = new Person();
		
		person.age = 30;
	}
	
	public void change2(int age)
	{
		age = 40;
	}
	*/
	
	//默认构造方法及构造方法
	public static void main(String[] aegs)
	{
		Person person = new Person(50);
		
		System.out.println(person.age);
	}
		
}

class Person
{
	int age;
	
	public Person(int i)
	{
		age = i;
	}
}
