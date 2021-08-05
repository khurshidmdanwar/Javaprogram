public class ArithOperators
{ 
    public static void main(String[] args) 
    { 
        int a, b, result,c;
        a=50;
        b=10;
        // + Addition
        result=a + b;
        System.out.println("Addition="+result);
        // - Substraction
        result=a - b;
        System.out.println("Substraction="+result);
        // * Mulitplication
        result=a * b;
        System.out.println("Multiplication="+result);
        // / Division
        result=a / b;
        System.out.println("Division="+result);
        // % Modulus
        result=a % b;
        System.out.println("Modulus="+result);
        a=5; b=10;
        a +=a + b;  
        System.out.println(a);   // Output :
        a=10; b=5;
        c= a /  b * 5;

        System.out.println(c);

    } 
}
