clas  Animal1{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal1{
void bark()
{
System.out.println("barking....");}
}
class Testinheritance{
public static void main(String args[]){
Dog d=new Dog();
d.bark();
d.eat();
}
}
