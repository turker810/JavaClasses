package com.class24_Inheritance;
 
public class Test {  // child1 ve inheritancele baglantili

	
	
	public static void main(String[] args) {
		
		Child1 ch = new Child1();
		
		System.out.println(ch.race);
		
		System.out.println(ch.eyeColor);
		
		System.out.println();
		
		
		ch.sing(); // parenttan geldi. inheritance class yani
		ch.code(); // child1 dan geldi. 
		
		
		System.out.println("parent\n");
		
		Inheritance parent = new Inheritance();
			
		System.out.println(parent.hairColor);	
		System.out.println(parent.eyeColor);
		System.out.println(Inheritance.race); // static bu 

		System.out.println();
		
		parent.sing();
		parent.code(); // cocuktan alamaz
		
}}
