import java.util.*;
public class get
{
    public static void check(int n,int i)
    {
        int BitMask=1<<i;
        if((n&BitMask)==0)
        {
            System.out.println(i+"position is"+0);
        }
        else{
             System.out.println(i+"position is"+1);
        }
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