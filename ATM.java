import java.util.Scanner;
class ATM
{
public static void main(String args[])
{
int bal=20000,w,d;
Scanner r=new Scanner(System.in);
while(true)
{
System.out.println("ATM");
System.out.println("Click 1 for Withdraw");
System.out.println("Click 2 for deposit");
System.out.println("Click 3 for Check balance");
System.out.println("Click 4 for exit");
System.out.println("Enter your choice");
int choice=r.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter amount for withdraw");
w=r.nextInt();
if(bal>=w)
{
bal=bal-w;
System.out.println("Transaction is successful");
}
else
{
System.out.println("Amount is insufficient");
System.out.println("Transaction is fail");
}
break;
case 2:
System.out.println("Enter amount for deposited");
d=r.nextInt();
bal=bal+d;
System.out.println("Amount is deposited");
System.out.println("Transaction is successful");
break;
case 3:
System.out.println("Balance is " +bal);
System.out.println("");
break;
case 4:
System.exit(0);
}
}
}
}
