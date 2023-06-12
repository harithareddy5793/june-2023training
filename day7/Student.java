class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis2{
public static void main(String args[]){
Student s1=new Student(456,"vini",5000f);
Student s2=new Student(783,"jaya",6000f);
s1.display();
s2.display();
}
}
