package com.class27_Final_Keyword;

public final class Final_Keyword { // hocanin
	
	public final String str="Hello";
	
	public static void main(String[] args) {

		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java is easy";
		//finalString="Java is hard";ce --> cannot modify final variable
		
		final int age=120;
		//age=100;ce
		
		Final_Keyword obj=new Final_Keyword();
		System.out.println(obj.str);
	}

	public final void hello() {
		System.out.println("I am a final method in Parent class");
	}
	public final void hello(int num) {
		System.out.println("I am a final method in Parent class");
	}
	//can we overload a final method
	
}
//class FinalKeywordChild extends FinalKeyword{
	//final methods cannot be overriden , we will get CE
//	public final void hello() {
//		System.out.println();
//	}
//}