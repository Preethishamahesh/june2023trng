import java.util.Scanner;
class Day4Swapping{
public static void main(String args[]){
Scanner scob =new Scanner(System.in);
int num1,num2;
num1=scob.nextInt();//23
num2=scob.nextInt();//35
int temp;
temp=num1;//temp=23
num1=num2;//num1=35
num2=temp;//num2=23
System.out.print(num1+"\n"+ num2);
}
}