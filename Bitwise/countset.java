import java.util.*;
public class countset
{
    public static void check(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
        
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();  
      
      check(n);
    }
}