import java.lang.*;

abstract class shape
{
int a,b;
double area;
shape(int x,int y)
{
a=x;
b=y;
area=0;
}
abstract void printArea();
}


class Rectangle extends shape
{
Rectangle(int x,int y)
{
super(x,y);
}
void printArea()
{
area=a*b;
System.out.println("Rectangle area="+" "+area);
}
}


class triangle extends shape
{
triangle (int x,int y)
{
super(x,y);
}
void printArea()
{
area=(a*b)*(0.5);
System.out.println("Triangle area="+" "+area);
}
}


class circle extends shape
{
circle(int x)
{
super(x,-1);
}
void printArea()
{
area=3.142*Math.pow(a,2);
System.out.println("circle area="+" "+area);
}
}


class demoshape
{
public static void main(String args[])
{
Rectangle r1=new Rectangle(1,2);
triangle t1=new triangle(3,4);
circle c1=new circle(5);
shape ref;
ref=r1;
ref.printArea();
ref=t1;
ref.printArea();
ref=c1;
ref.printArea();
}
}