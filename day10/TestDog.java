class Animal{
public void move()
{
System.out.println("animal can move");
}
}
class Dog extends Animal{
public static void main(){
System.out.println("Dogs can walk and run");
}
}
class TestDog{
public static void main(String args[]){
Animal a=new Animal();
Animal b=new Dog();
a.move();
b.move();
}
}