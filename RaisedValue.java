import java.util.*;
public class RaisedValue
{
    public static void main(String args[])
    {
        int num1, num2, i,j, p=1;
        long f,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number :");
        num1=sc.nextInt();
       // num2=sc.nextInt();
       // S=!(15 )+ !(24)+ !(33)+ !(42)+ !(51)
        for(i=1;i<=num1;i++)
        {
            p=1;
            f=1L;
            for(j=0;j<=num1-i;j++)
            {
                p=p*i;
            }
            System.out.println(p);
            for(j=1;j<=p;j++)
            {
                f=f*j;
            }
            s=s+f;
        }
        System.out.println("Sum= :"+s);
    }
}
