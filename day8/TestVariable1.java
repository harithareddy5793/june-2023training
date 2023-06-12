class Student{
int rollno;
String name;
static String college="ITS";
Student(int r,String n);
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestVariable1{
public static void main(String args[])
{
Student s1=new Student(567,"abhi");
Student s2=new Student(486,"ravi");
Student college="Y.H.REDDY";
s1.display();
s2.display();
}
}

















