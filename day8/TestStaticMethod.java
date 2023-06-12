class Calculate{

int rollno;
String name;
static String college="ITS";
static void change(){
college="MTIE";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod{
public static void main(String args[])
{
Student.change();
Student s1=new Student(567,"bhanu");
Student s2=new Student(467,"jayasree");
Student s3=new Student(634,"vini");
s1.display();
s2.display();
s3.display();
}
}
