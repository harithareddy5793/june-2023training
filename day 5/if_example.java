import java.util.Scanner;
class if_example{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int max;
if(a>b)
{
max=a;
System.out.println("maximum numer is"+max);
}
else
{
max=b;
System.out.println("maximum number is"+max);
}
}
}