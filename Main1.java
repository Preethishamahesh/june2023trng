import java.util.*;
class MarksDoesNotFitException extends Exception{
String msg;
MarksDoesNotFitException(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
public class Main1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rollno=sc.nextInt();
String name=sc.next();
int Marks=sc.nextInt();
try{
if(Marks<0){
throw new MarksDoesNotFitException("marks should not be negative.1 marks=0");
}
}
catch(MarksDoesNotFitException ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
