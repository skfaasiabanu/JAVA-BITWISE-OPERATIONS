import java.util.*;
public class clearrange
{
    public static void check(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int BitMask=a|b;
        System.out.println(n & BitMask);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();  
      int i=sc.nextInt();
      int j=sc.nextInt();
      check(n,i,j);
    }
}