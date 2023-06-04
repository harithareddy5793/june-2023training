class Student{
int id;
String name;
}
class TestStudent3{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.id=456;
s1.name="haritha";
s2.id=178;
s2.name="bhanu";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}
