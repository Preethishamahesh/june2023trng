import java.util.Scanner;
public class SumNumbers1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int sum = 0;
for(int j=1; j<=i;j++)
{
sum = sum+j;
}
System.out.println(sum);
}
}