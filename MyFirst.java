public class MyFirst
{
    //boolean a;
   public static void main(String args[])
   {
       //int a;
       int a=6, b=8, c=9;
       a%=a + ++b - c-- + c + b++ + b;
       // a = 6 % (6 + 9 - 9 + 8 + 9 + 10)-->39
       System.out.println(a);
    }
}
 // 33, 37, 38