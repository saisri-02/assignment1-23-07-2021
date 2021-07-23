import java.util.*;
public class Arraylistiterator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value : ");
int n=sc.nextInt();
ArrayList al=new ArrayList();
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
al.add(sc.nextInt());
}
Iterator itr=al.iterator();
while(itr.hasNext())
{
Integer i=(Integer)itr.next();
System.out.println(i);
}
}
}

output:

Enter n value : 
5
Enter array elements : 
12 4 6 9 10
12
4
6
9
10