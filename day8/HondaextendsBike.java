class Bike{
final void run()
{
System.out.println("running");
}
}
class Honda extends Bike{
void run()
{
System.out.println("running safely with 100kmph");
}
public static void main (Sting args[])
{
Honda obh=new Honda();
obh.run();
}
}
