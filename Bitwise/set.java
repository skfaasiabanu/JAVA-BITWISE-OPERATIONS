import java.util.*;
public class set
{
    public static void check(int n,int i)
    {
        int BitMask=1<<i;
        System.out.println( n|BitMask);
        
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();  
      int i=sc.nextInt();
      check(n,i);
    }
}