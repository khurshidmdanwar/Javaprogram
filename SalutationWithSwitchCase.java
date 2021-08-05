import java.util.*;

public class SalutationWithSwitchCase
{

    public static void main(String args[])//throws IOException
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number(1-10):");
        num=sc.nextInt();
        switch(num)
        {
            case 1:
            case 2:
            case 3:
            System.out.println("Good Morning");
            break;
            case 4:
            case 5:
            System.out.println("Good After Noon");
            break;
            case 6:
            case 7:
            case 8:
            case 9:
            System.out.println("Good Evening");
            break;
            case 10:
            System.out.println("Good Night");
            break;
            default:
            System.out.println("Good Day");
        }
    }
}