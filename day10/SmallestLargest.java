import java.util.Scanner;
class SmallestLargest
{
public static void main(String args[])
{
int n,i=0,c=0,avg;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements");
for(i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.print(a[0]);
System.out.print(a[n-1]);
for(int k:a)
{
c=c+k;
}
System.out.print(c);
avg=c/n;
System.out.println(avg);
}
}



 