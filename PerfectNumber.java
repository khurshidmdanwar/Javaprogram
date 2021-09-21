import java.util.*;
public class PerfectNumber
{
    int num, sum, i;  // Instance Variable
    int perfectNum(int n)
    {
        num=n;
        sum=0;
        for(i=1; i<num; i++)
        {
            if(num % i == 0)
             sum=sum + i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PerfectNumber ob=new PerfectNumber();
        int p, number;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        p=ob.perfectNum(number);
        if(p == number)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }        
}
