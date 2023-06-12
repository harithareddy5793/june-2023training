class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,Strng name,String course,flaot fee){
this.fee=fee;
this(rollno,name,course);
}
void display(){
System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
public static void main(String args[]){
Student s1=new Student(456,"vini","java");
Student s2=new Student(783,"jaya","python");
s1.display();
s2.display();
}
}
