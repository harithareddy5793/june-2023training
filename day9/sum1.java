import java.util.Scanner;
class sum1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] a=sc.nextInt();
int sum=0;
for(int i:a)
{
sum=sum+i;
}
System.out.println(sum);
}
}