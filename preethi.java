class Gopi{
public void playcricket(){
System.out.print("PlayCricket called from class Gopi");
}
public void playcricket2(){
System.out.print("PlayCricket2 called from class Gopi");
}
}
class Preethi
{
public static void main(String args[]){
Gopi ob=new Gopi();
ob.playcricket();
ob.playcricket2();
}
}
