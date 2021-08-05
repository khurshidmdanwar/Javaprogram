import java.util.*;
public class PositiveNegativeNumber
{
    static int num;  // Class variable
   
    public static void main(String args[])
    {
          
        Scanner sc=new Scanner(System.in);
        //PositiveNegativeNumber ob=new PositiveNegativeNumber();
        System.out.println("Enter a number");
       num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Numvber");
        }
    }
}
