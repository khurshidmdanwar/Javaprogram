import java.util.*;
public class Factorial
{
    int i, f, num; // Instance Variable
    int fact(int n)
    {
        num=n;
        f=1;
        for(i=1; i<=num; i++)
        {
            f=f * i; // 1*2*3*4*5
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Factorial ob=new Factorial();
        int no, fa;
        System.out.println("Enter a number:");
        no=sc.nextInt();
        fa=ob.fact(no);
        System.out.println("Factorial of " + no + " is " + fa);
    }
    
}
