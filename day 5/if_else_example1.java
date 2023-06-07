import java.util.Scanner;
class {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
if(j==0)
{
System.out.println("division by error");
}
else
{
System.out.println(i+" divided by"+j+"is"+(i/j));
}
i=i+j;
}
}