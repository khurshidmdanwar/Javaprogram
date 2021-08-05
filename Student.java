import java.util.*;
class Student
{
    public static void main(String args[])
    {
        int a,b,c;
        int avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subjects Mark:\n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(a+b+c)/3;
        if(avg>=60)
        {
            System.out.println("First Div\n");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Second Div\n");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Third Div\n");
        }
        else
        {
            System.out.println("Fail\n");
        }

    }
}