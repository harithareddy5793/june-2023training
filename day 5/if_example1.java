import java.util.Scanner;
class if_example1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int min;
if(b>a)
{
min=a;
System.out.println("min numer is"+min);
}
else
{
min=b;
System.out.println("min number is"+min);
}
}
}