import java.util.Scanner;
class LowerExample2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
String rev ="";
int ascii;
for(int i=0;i<=strobj.length()-1;i++)
{
if(strobj.charAt(i)>='A' && strobj.charAt(i)<='Z')
{
ascii=strobj.charAt(i);
ascii+=32;
rev=rev+(char)ascii;
}
else
{
rev=rev+strobj.charAt(i);
}}
System.out.println(rev);
}

}

