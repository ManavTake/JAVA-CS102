import java.util.Scanner;

class Book
{

String title;
String author;
int numPages;
double price;


Book(){
title="Default";
author="Default";
price=0.0;
numPages=0;
}

void setTitle(String t)
{
title=t;
}

void setAuthor(String a)
{
author=a;
}

void setPrice(double p)
{
price=p;
}

void setPages(int np)
{
numPages=np;
}

public String toString()
{
return title+ "\t"+ author +"\t"+price +"\t"+ numPages ;
}

}



class BookDetails
{

public static void main(String args[])
{
String t,a;
double p;
int np,n;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the num of books: ");
n=sc.nextInt();

Book b[]=new Book[n];

for(int i=0;i<n;i++)
{
System.out.println("Enter the Title of book"+(i+1)+" : ");
t=sc.next();

System.out.println("Enter the Name of book author : ");
a=sc.next();

System.out.println("Enter the price of book : ");
p=sc.nextDouble();

System.out.println("Enter the num of pages : ");
np=sc.nextInt();

b[i]=new Book();
b[i].setTitle(t);
b[i].setAuthor(a);
b[i].setPrice(p);
b[i].setPages(np);
}

System.out.println("Title\tAuthor\tPrice\tPages\n");
for(int i=0;i<n;i++)
System.out.println(b[i]);
}

}