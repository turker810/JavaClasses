package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_22 {

public static void main(String[]args) {
	
	/*Write  a program that takes user's first name and surname.
First input: "Please Enter First Name" should print first input.
Second input:"Please Enter Surname" should print second input.

Final Output: 
Print both first name and surname on one line. Make sure there is a space between First Name and Surname.

	 * 
	 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please Enter First Name");
				
		String name = scan.nextLine();
		
		System.out.println("Please Enter Surname");
		
		String surname = scan.nextLine();
		
		System.out.println(name+ " "+ surname);
		
		
		
				
		
		
		
		
		
	}
}
