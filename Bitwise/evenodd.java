import java.util.*;
public class evenodd
{
    public static void check(int n)
    {
        int BitMask=1;
        if((n&BitMask)==0)
        {
            System.out.println("even number");
        }
        else{
             System.out.println("odd number");
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();  
      check(n);
    }
}