public class CapToSmallToCap
{
    public static void main(String args[])
    {
        String n="HelLO WorlD Java";
        int l, i;
        l=n.length();
        char ch, ch1=0;
        System.out.println(n);
        for(i=0; i<l; i++)
        {
            ch=n.charAt(i);  // charAt will extract a character
            if(ch!=' ')  
            {
                if(ch>=65 && ch<=90)
                    ch1=(char)(ch + 32);
                if(ch>=97 && ch<=122)
                    ch1=(char)(ch -32); 
                System.out.print(ch1);
            }
            else
                System.out.print(" ");
        }
    }
}
