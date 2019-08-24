import java.util.*;
class Box
{
public int length;
public int breadth;
public void read_data(int a,int b)
{
length=a;
breadth=b;
System.out.println("length="+length);
System.out.println("breadth="+breadth);
}
public void display_area()
{
System.out.println(length*breadth);
}
}

class a
{
public static void main(String args[])
{
Box b=new Box();
b.display_area();
b.read_data(2,3);
}
}
