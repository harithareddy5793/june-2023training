public class point{
double x;
double y;
public void setx(double x_value){
x=x_value;
}
public void sety(double y_value){
y=y_value;
}
public double getx(){
return x;
}
public double gety(){
return y;
}
public double Square_distance_from_origin()
{
return x*x+y*y;
}
}
class Test5
{
public static void main(String args[]){
point p;
p=new point();
p.setx(5);
p.sety(7);
System.out.println(p.Square_distance_from_origin()); 
}
}

