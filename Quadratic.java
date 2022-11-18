import java.util.Scanner;

public class Quadratic
{

public static void main(String args[])
{
Scanner ip = new Scanner(System.in);
System.out.println("Enter the value of a: ");
double a= ip.nextDouble();
System.out.println("Enter the value of b: ");
double b= ip.nextDouble();
System.out.println("Enter the value of c: ");
double c= ip.nextDouble();
double r1,r2;
double d= b*b-(4*a*c);

if(a==0)
{
  System.out.println("Quadratic doesnt exist");
}

else {

if(d>0)
{
    r1= (-b + Math.pow(d,0.5)  )/(2*a);
    r2= (-b - Math.pow(d,0.5) )/(2*a);
    System.out.println("Roots are real and distinct");
    System.out.println("The roots are :"+ " "+r1 +" and " +r2);
}

else if(d==0)
{
	
    r1= r2=  (-b)/(2*a);
    System.out.println("Roots are real and equal");
    System.out.println("The roots are :"+ " "+r1 +" and " +r2);
}

else if(d<0)
{
    r1= (-b)/(2*a);
    r2= Math.pow(-d,0.5)/(2*a);
    System.out.println("Roots are unreal and distinct");
    System.out.println("The roots are :");
    System.out.println("Root1 = "+r1+ "+ "+r2+"i");
    System.out.println("Root2 = "+r1+ "- "+r2+"i");
}

else
System.out.println("Invalid input");
    }

    }
}
