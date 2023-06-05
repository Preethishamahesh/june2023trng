import java.util.Scanner;
public class FactorialDemo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int res=1;
System.out.println("Enter any positive integer");
for(int i=1;i<=num;i++)
{
res *=i;
}
System.out.println("Factorial: "+ res);
}
}