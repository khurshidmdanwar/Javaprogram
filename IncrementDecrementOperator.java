public class IncrementDecrementOperator
{
    public static void main(String args[])
    {
        int a=5, b=4, c;
        c = a++  * 10 + ++b + a;
        System.out.println("c=" + c);
        a=5;
        b=4;
        c = --a  * 10 + ++b + --a;
        System.out.println("c=" + c);
        a=5;
        b=4;
        c = --a  * 10 + b-- + --a + --b;
        System.out.println("c=" + c);
        a=5;
        b=4;
        a+=++a + b++ + --b;// 5 + 6 + 4 + 4 
        System.out.println("a=" + a);
        a=5;
        a-=10;
        System.out.println("a=" + a);
    }
}
