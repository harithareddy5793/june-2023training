import java.util.Scanner;
class Largest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("largest"+a);
}if(b>c && b>a)
{
System.out.println("largest"+b);}
if(c>a && c>b)
{
System.out.println("largest"+c);
}
}
}
