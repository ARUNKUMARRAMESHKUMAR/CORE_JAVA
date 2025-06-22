import java.util.Scanner;
class main{		
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		String name="Arunkumar";
		
		System.out.println("enter your name");
		String userinput=input.nextLine();
		
		if(userinput.equals(name))
		{
			System.out.println("valid input");
		}
		else
		{
			System.out.println("invalid input");
		}
		
		System.out.println(userinput);
		System.out.println(name);
}
}		



--------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class main{		
	public static void main(String args [])
	{
		///if and else conditions
		int fpassword=123;
		String lpassword="arunkumar";
		String mainpassword=fpassword+lpassword+fpassword;
		
		System.out.println(mainpassword);
		System.out.println("enter your passsword");

		String pass=input.next();

		if(pass.equals(mainpassword))
		{
			System.out.println("correct password");
		}		
		else
		{
			System.out.println("incorrect password");
		}
}
}

--------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class main{		
   public static void main(String args [])
     {
	if(9<s_e_time)
	{
		System.out.println("Student will be allow in the class....!!!!");
	}
	
	else
	{
		System.out.println("Student not allow in the class....!!!!");

	}


--------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class virat {

	public static void main (String args [])
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" your choice RCB is win or lose");
		String value=input.nextLine();
		if(value.equals(value))
		{
			System.out.println(" esala cup namde ");
		}
		else
		{
			System.out.println(" RCB lose ");
		}
	}
}
