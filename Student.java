import java.util.Scanner;

public class Student{
	int i,r,avg=0;
    String name,USN;
    Scanner ip=new Scanner(System.in);
    System.out.println("Enter the student Name and USN : ");
    string name = ip.nextLine();
    string USN = ip.nextLine();
    int[] marks= new int[7];
    int[] ret_val= new int[7];
  
	
	for(i=0;i<5;i++)
	{
		System.out.println("Enter the Marks in order(Maths,Chem,BEC,Mech and PSP : ");
		marks[i] = ip.nextInt();
		total= total+marks[i];
	}

	avg= total/5;


for(r=0;r<5;r++)
{
ret_val[i]=calculator(marks[i]);

switch(ret_val[i])
{
case 0: System.out.println("Fail Grade=F");
		break;
case 11: System.out.println("Invalid marks Entered");
		break;
case 10: System.out.println("Outstanding Grade=O");
		break;
case 9: System.out.println("Very Good Grade=A+");
		break;
case 8: System.out.println("Good Grade=A");
		break;
case 7: System.out.println("Can do better Grade=B+");
		break;
case 6: System.out.println("Work harder Grade=B");
		break;
case 5: System.out.println("Pass Grade=P");
		break;
default: System.out.println("ERROR");
}

}


}

int calculator(int marks)
{
if(marks<40)
return 0;

else if(marks>100)
return 11;

else
{
if(marks>=90 && marks<=100)
return 10;
else if(marks>=80 && marks<90)
return 9;
else if(marks>=70 && marks<80)
return 8;
else if(marks>=60 && marks<70)
return 7;
else if(marks>=50 && marks<60)
return 6;
else(marks>=40 && marks<50)
return 5;
}

}





////////int calculator(marks[i])= ret_val;



public class main {
		public static void main(String args[]){
		System.ot.println("This is main");

}    
}
