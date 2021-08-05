public class TernaryOperator
{
    public static void main(String args[])
    {
        int a,b,max;
        a=10;
        b=50;
        // Using if else statement
        if(a>b)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        System.out.println("Max="+max);
        // Using Ternary Operator
        max=(a>b) ? a : b;
        System.out.println("Max="+max);
    }
}
