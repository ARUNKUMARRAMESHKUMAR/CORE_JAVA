package myfirstproject;

import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {

		Scanner obj= new Scanner(System.in);
		
		int ak;
		int i=12;
		String s="arunkumar";
		char c='A';
		long l=1232378965;
		short sho =4343;
		double d=123.5345876;
		float f=1.54656543f;
		byte b=123;
		boolean A=true;
		System.out.println(i+"  "+s+"  "+c+"  "+l+"  "+sho+"  "+d+"  "+f+"  "+b+"  "+A);		
		
		
		//string data type.
		System.out.println("enter your name");
		String name =obj.nextLine();
		System.out.println("your name is  :"+name);
		
		
		//integer data type.
		System.out.println("enter your age");
		int age =obj.nextInt();
		System.out.println("your age is :"+age);
		System.out.println("enter integer value");
		int i1=obj.nextInt();
		System.out.println("your double value "+i1);
		
		// character data type.
		//creating and initializing custom character
		System.out.println("  enter character1 value:");
		char c1 =obj.next().charAt(0);
		System.out.println("your char value "+c1);
		
		System.out.println("  enter character2 value:");		
		char char2=obj.next().charAt(0);
		System.out.println("your charecter value "+char2);		
		
		
		
		// float data type.
		System.out.println("Enter float value");
		float f1=obj.nextFloat();
		System.out.println("your float value "+f1);
		System.out.println("enter float value ");
		float f2=obj.nextFloat();
		System.out.println("your float value "+f2);

		
		
		// double data type.
		System.out.println("Enter double value ");
		double d1=obj.nextDouble();
		System.out.println("your double value "+d1);
		
		
		
		//byte data type
		System.out.println(" enter byte value ");
		byte b1=obj.nextByte();
		System.out.println("your byte value "+b1);

		
		
		//this will give error as number is 
		//large then short range
		//short s1=23434545
		//short data type
		System.out.println("enter short value ");
		short s1=obj.nextShort();
		System.out.println("your short value "+s1);

		
		//double data type
		System.out.println("enter double value ");
		double d2=obj.nextDouble();
		System.out.println("your double value "+d2);

		
		System.out.println("enter long value ");
		long l1=obj.nextLong();
		System.out.println("your long value "+l1);

		boolean arun=true;
		boolean deepa=false;
		System.out.println((arun&&deepa));
		System.out.println((arun||deepa));
		System.out.println((!arun));
	}

}
