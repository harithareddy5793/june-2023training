import java.util.Scanner;
class ReversePattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int n=sc.nextInt();
int y;
int x;
if(n%2==0)
{
x=n/2;
y=n/2;
}
else
{
x=n/2;
y=n/2+1;
}
printPattern(ch,x);
printReversePattern(ch,y);
}

public static void printPattern(char c,int n)
{
for(int i=1;i<=n;i++)
printLine(c,i);
}
public static void printReversePattern(char c,int n)
{
for(int i=n;i>=1;i--)
printLine(c,i);
}

public static void printLine(char c,int col)
{
System.out.println();
for(int i=1;i<=col;i++)
System.out.print(c);
}
}





