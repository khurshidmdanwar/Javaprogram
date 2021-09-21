import java.util.*;
public class LinearSearch
{
    public static void main(String args[])
    {
        int n[]=new int[5];  //[9, 7, 6 ,5........]
        int i, f=0, j, p=0, s;  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        for(i=0; i<5; i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("Enter number to search:");
        s=sc.nextInt();
        for(i=0; i<5; i++)
        {
            if(s==n[i])
            {
                f=1;
                p=i+1;
                break;
            }
        }
        if(f==1)
            System.out.println(s + " Found at " + p);
        else
            System.out.println("Not Found");
    }
}
