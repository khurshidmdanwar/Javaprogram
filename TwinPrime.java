import java.util.*;
public class TwinPrime
{
    int i, p;
    int isPrime(int num)
    {
        p=1;
        for(i=2; i<num; i++)
        {
            if(num % i == 0)
            {
                p=0;
                break;
            }
        }
        return p;
    }        
    public static void main(String args[])
    {
        int n1, n2, p1, p2;
        TwinPrime ob=new TwinPrime();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        n1=sc.nextInt(); 
        System.out.println("Enter Second number:");
        n2=sc.nextInt();
        p1=ob.isPrime(n1);
        p2=ob.isPrime(n2);
        if(p1==1 && p2==1 && Math.abs(n1-n2)==2)
        {
            System.out.println("Twin Prime number");
        }
        else
        {
            System.out.println("Not a Twin Prime number");
        }
    }
}
//11 13, 5 7, 17 19
//11 13 ---> difference between the prime must be 2