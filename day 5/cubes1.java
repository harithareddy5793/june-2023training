import java.util.Scanner;
public class cubes1{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int result=1;
for(int i=1;i<=n;i++){
result=i*i*i;}
System.out.println(+result);
}
}
 