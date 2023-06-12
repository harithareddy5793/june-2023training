import java.util.Scanner;
class palindromeEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
strobj=strobj.toLowerCase();
String rev ="";
for(int i=0;i<=strobj.length()-1;i++)
{
rev=rev+strobj.charAt(i);}
if(strobj.equals(rev))
{
System.out.println("yes");
}
else{

System.out.println("no");
}
}
}
