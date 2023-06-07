import java.util.Scanner;
public class PalindromeDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n,r="";
System.out.print("enter a number"); 
n=sc.nextLine();
int length=n.length();
for(int i=length-1;i>=0;i--)
r=r+a.charAt(i);
if(n.equals(r)){
System.out.println("it is a palindrome");
}
else{
System.out.println("it is not palindrome");
}
}
}