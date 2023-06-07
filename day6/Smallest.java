import java.util.Scanner;
class Smallest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a<b && a<c)
{
System.out.println("smallest"+a);
}if(b<c && b<a)
{
System.out.println("smallest"+b);}
if(c<a && c<b)
{
System.out.println("smallest"+c);
}
}
}
