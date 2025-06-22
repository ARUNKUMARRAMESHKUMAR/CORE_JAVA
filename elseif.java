////In Java, else if is a control flow statement used to test 
multiple conditions sequentially. It provides an alternative path of execution 
when the preceding if or else if conditions evaluate to false.////

------------------------------------------------------------------------------------------------------------------
package conditions;
import java.util.Scanner;
import java.io.*;
public class ifcondition {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in)
	System.out.print("Enter Any Number :");
		int num=input.nextInt();
		if(num%2!=0)
		{
			System.out.println("Number "+num+" is Weird");
		}
		else if(num%2==0 && num>2 && num<5)
		{
			System.out.println("Number "+num+" is Not Weird");
		}
		else if(num%2==0 && num<20 && num>6)
		{
			System.out.println("Number "+num+" is Weird");
		}
		else
		{
			System.out.println("Number"+num+"is Not Weird");
		}

}
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------


package conditions;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
public class elseif {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Which day you do you want Enter number :");
int day = s.nextInt();
if (day == 1) {
System.out.print("Sunday");
}
else if (day == 2)
 {
     System.out.print("Monday");
 }
 else if (day == 3)
 {
     System.out.print("Tuesday");
 }
 else if (day == 4)
 {
     System.out.print("Wednesday");
 }
 else if (day == 5)
 {
     System.out.print("thursday");
 }
 else if (day == 6)
 {
     System.out.print("Friday");
 }
 
 else if (day == 7)
 {
     System.out.print("Saturday");
 }
 
 else
 {
     System.out.print("Number is invalid");
 }
}
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

