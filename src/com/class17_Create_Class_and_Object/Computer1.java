package com.class17_Create_Class_and_Object;

	public class Computer1 { // bunun main methodu asagida
		
		//define features, attributes
		
		String monitor, brand, name, mouse;
		
		boolean keyboard;
		
		int size, memory, screen, ram;
		
		///////////////
		
		//define behavior, actions
		
		void playGames() {// method header
			//method body
			System.out.println("I can play on my "+name);
		}
		
		void javaCoding() {
			System.out.println("I can do Java coding on my "+name);
		}
		
		void watchMovie() {
			System.out.println("I can watch movie on my "+name);
		}
		
////////////////////////////////////////////////////////////////////////
		
	public static void main(String[] args) {
			
		Computer1 comp1=new Computer1();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
			
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();

		///////////////////
		
		System.out.println("---Creating 2nd object of a computer type---");
		
		Computer1 computer2=new Computer1();
		computer2.brand="Dell";
		computer2.name="420";
		computer2.memory=125;
		
		computer2.javaCoding();
		computer2.watchMovie();
		computer2.playGames();
			
		}
	}


