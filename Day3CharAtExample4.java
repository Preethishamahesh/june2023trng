public class Day3CharAtExample4{
public static void main(String args[]){
String str="Welcome to java portal";
for(int i=0;i<=str.length()-1;i++){
if(i%5!=0){
System.out.println("Char at"+i+"place"+str.charAt(i));
}
}
}
}