class Main {
    public static void main(String[] args) {
        int stars = 5;
        for (int i = 0; i < stars; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

output:
*****
*****
*****
*****
*****



class Main {
    public static void main(String[] args) {
        int stars = 5;

        for (int i = stars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

output:
*****
****
***
**
*


 
 class Main {
    public static void main(String[] args) {
        int stars = 5;

        for(int i=1;i<=stars;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}


output:
*
**
***
****
*****

 


 
for(int i=0;i<=10;i++)
{
if(i!=10)
{
System.out.println(i);
}
}

output:
1
2
3
4
5
6
7
8
9





import java.util.Scanner;
class arun
{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter your table number :");
int table=s.nextInt();
//s.nextLine();
System.out.print("how many long do you want :");
int size=s.nextInt();

for(int i=1;i<=size;i++)
{
System.out.println(i+"x"+table+"="+i*table);
}
}
}

output:
Enter your table number:6
how many long do you want :15
1x6=6
2x6=12
3x6=18
4x6=24
5x6=30
6x6=36
7x6=42
8x6=48
9x6=54
10x6=60
11x6=66
12x6=72
13x6=78
14x6=84
15x6=90




 
