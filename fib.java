import java.io.*;
import java.util.*;
class fib
{
public static void main(String[] args)
{
int i,f,se,t;
Scanner s=new Scanner(System.in);
System.out.println("Enter the first element:");
f=s.nextInt();
System.out.println("Enter the second element:");
se=s.nextInt();
System.out.println("The fibanocii series are"+f);
System.out.println(se);
for(i=0;i<=10;i++)
{
t=f+se;
System.out.println(t);
f=se;
se=t;
}
}
}

