public class LogicalOperator
{ 
    public static void main(String[] args) 
    { 
        boolean a, b;
        boolean c, d;
        a=true;
        b=false;
        // && and Operator
        c=a && b;
        System.out.println(c);
         // || and Operator
        d=a || b ;
        System.out.println(d);
         // ! and Operator
        System.out.println(!b);
        System.out.println(!(!b));
    }
}