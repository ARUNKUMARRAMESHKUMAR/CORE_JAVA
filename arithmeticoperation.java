package myfirstproject;

import java.util.Scanner;

public class arithmeticoperation {

	public static void main(String[] args) {
//arithmetic operation +,-,*,/,**.
		Scanner obj= new Scanner(System.in);
		//add product price
		System.out.print("enter prodect1 price :");
		int p1=obj.nextInt();
		System.out.print("enter prodect2 price :");
		int p2=obj.nextInt();
		System.out.print("enter prodect3 price :");
		int p3=obj.nextInt();
		System.out.print("enter prodect4 price :");
		int p4=obj.nextInt();
		int tp=p1+p2+p3+p4;
		System.out.println("Total prodects price :"+tp);
//small type add program.
		int a,b,c,d;
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		d=a+c+b;
		System.out.println("Total prodects price :"+d);
// All Arithmetic operation   		
		int x,y,A,M,S,MO;
		float D;
		System.out.println("enter a value :");
		x=obj.nextInt();
		System.out.println("enter b value :");
		y=obj.nextInt();
		A=x+y;
		M=x*y;
		S=x-y;
		D=x/y;
		MO=x%y;
		System.out.println("ADD VALUE : "+A);
		System.out.println("MUL VALUE : "+M);
		System.out.println("SUB VALUE : "+S);
		System.out.println("DIV VALUE : "+D);
		System.out.println("MODULUS VALUE : "+MO);

		

		int num1,num2,result;
		num1=23;
		num2=10;
		result=num1%num2;
		System.out.println(result);
	
		//auto increment and decrement.
		int a1=3;
		int a4=10;
		int a2=a1++;
		int a3=++a2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(--a1);
		System.out.println(a2--);
		System.out.println(++a3);
		System.out.println(a1++);
		System.out.println(--a2);
		System.out.println(a3--);
		System.out.println(++a4);
		System.out.println(a4-5);
		System.out.println(a3+2);
		int a5=a5=+2;
		int a6;
		System.out.println("a5 value is :"+a5);
		System.out.println(a5);
		System.out.println(a4);
		}

}
