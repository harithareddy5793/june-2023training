class Student{
int rollno;
String name;
Student(){rollno=0;name=null;}
Student(int r,String n){
rollno=r;
name=n;
}
void displayinformation(){
System.out.println(rollno+" "+name);}
}
class TestStudent5{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student(222,"hari");
s1.displayinformation();
s2.displayinformation();
}
}
