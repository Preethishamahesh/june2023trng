class Student{
int id;
String name;
}
class TestStudent3{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.id=561;
s1.name="preethi";
s2.id=560;
s2.name="bhagi";
System.out.println(s1.id+"\n"+s1.name);
System.out.println(s2.id+"\n"+s2.name);
}
}