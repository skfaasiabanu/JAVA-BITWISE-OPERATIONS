import java.util.*;
public class update
{
    public static int Update(int n,int i,int new_bit)
    {
        /*if(new_bit==0)
        {
            return clear(n,i);
        }
        else
        {
            return set(n,i);
        }
        */
       n=clear(n,i);
       int BitMask=new_bit<<i;
       return n|BitMask;
    }
    public static int  clear(int n,int i)
    {
       int BitMask1=~(1<<i);
       return n & BitMask1;
    }
    public static int  set(int n,int i)
    {
       int BitMask2=(1<<i);
       return n | BitMask2;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();  
      int i=sc.nextInt();
      int new_bit=sc.nextInt();
      System.out.println(Update(n,i,new_bit));
    }
}