import java.util.Scanner;
public class PalindromeDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
String pd="";
System.out.print("enter a string"); 
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--){
pd=pd*n%10(charAt(i));

if(n.equals(rp)){
System.out.println("it is a palindrome");
}
else{
System.out.println("it is not palindrome");
}
}
}