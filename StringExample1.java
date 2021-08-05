public class StringExample1
{
    public static void main(String args[])
    {
        String n="HELLO";
        int l, i;
        l=n.length();   // function of String
        char ch;
        for(i=0; i<l; i++)
        {
            ch=n.charAt(i);  // charAt will extract a character
            System.out.println(ch);
        }
    }
}
