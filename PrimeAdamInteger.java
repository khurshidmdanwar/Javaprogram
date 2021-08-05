import java.util.*;
public class PrimeAdamInteger
{
    /*
     *If n=13 and reverse of "n" =31, then,  
     *(13)^2 = 169                       
     *(31)^2 =961 which is reverse of 169    
     */
    int p, i, rev, num, digit;
    boolean prime;
    public PrimeAdamInteger()
    {
        rev = 0;
        prime = true;
    }

    int reverse(int n)
    {
        num = n;
        rev = 0;
        while(num!=0)
        {
            digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        return rev;
    }
    boolean primeNumber(int n)
    {
        num = n;
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String args[])
    {
        int number, rev, sq1, sq2, revsq;
        boolean isPrime1, isPrime2;
        PrimeAdamInteger ob = new PrimeAdamInteger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Check prime Adam Integer :");
        number = sc.nextInt();
        // Call the reverse function
        rev = ob.reverse(number);
        isPrime1 = ob.primeNumber(number);
        isPrime2 = ob.primeNumber(rev);
        sq1 = number * number;
        sq2 = rev * rev;
        revsq = ob.reverse(sq2);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(revsq);
        if((isPrime1==true && isPrime2==true) && sq1 == revsq)
        {
            System.out.println("Entered number is Prime Adam Integer");
        }
        else
        {
            System.out.println("Entered number is Not Prime Adam Integer");
        }        
    }
}
