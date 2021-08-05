/*import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;*/
import java.util.*;

public class SimpleInterest
{
    static double p, t, r, si;
    public static void main(String args[])//throws IOException
    {
        
        Scanner sc=new Scanner(System.in);
       // SimpleInterest ob=new SimpleInterest();
        /*InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);*/
        System.out.println("Enter Principal, Rate and time:");
       /* p=Double.parseDouble(br.readLine());
        t=Double.parseDouble(br.readLine());
        r=Double.parseDouble(br.readLine());*/
       p=sc.nextDouble();
       t=sc.nextDouble();
       r=sc.nextDouble();
       si=(p*t*r)/100.0;
       System.out.println("Simple Interest="+si);
    }
}
