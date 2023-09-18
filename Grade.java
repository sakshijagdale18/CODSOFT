import java.util.Scanner;
class Grade
{
public static void main(String args[])
{
int a,b,c,d;
System.out.println("Enter marks of four subjects");
Scanner r=new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
c=r.nextInt();
d=r.nextInt();
int sum=a+b+c+d;
System.out.println("Total Marks"+sum);
double avg=sum/4.0;
System.out.println("Average percentage"+avg);
if(avg>=75)
{
System.out.println("Grade is A");
}
else if(avg>=55)
{
System.out.println("Grade is B");
}
else if(avg>=35)
{
System.out.println("Grade is C");
}
else
{
System.out.println("Fail");
}
}
}
