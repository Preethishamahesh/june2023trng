import java.util.Scanner;
class If_Else_example1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
i=sc.nextInt();
int j;
j=sc.nextInt();
if(j==0)
{
System.out.println("Division by  zero error");
}
else 

System.out.println(i+" divided by "+j+" is "+(i/j));
i=i+j;
}
}

