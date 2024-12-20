import java.util.*;
public class power
{
    public static void check(int n)
    {
        int bit=n&(n-1);
        if(bit==0)
        {
            System.out.println(n+"is a power of 2");
        }
        else{
             System.out.println(n+"is not a power of 2");
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