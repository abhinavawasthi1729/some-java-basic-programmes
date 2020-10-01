import java.util.Scanner;
class Linearsearch
{
public static void main(string ar[])
{
int i,n,search,a[];
System.out.println("enter the size of the array");
Scanner sc=new Scanner(system.in);
n=sc.nextint();
a=new int [n];
System.out.println("enter the array element:");
for(i=0;i<n;i++)
{
a[i]=sc.nextint();
}
System.out.println("enter the search element:");
search=sc.nextint();
  int flog=0;
for(i=0;i<n;i++)
{
    if(search==a[i])  {                                                  //if you use if condition inside loop .... after every increase in i 
        flag=1;
         break;                                                           //ie on every loop it will print either of the two lines
  
    }
}
  if(flag==1)
    System.out.println("found");
  else
    System.out.println("not found");
}
