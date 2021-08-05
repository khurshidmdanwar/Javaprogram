import java.util.*;
public class StringTokenExample
{
    public static void main(String rags[])
    {
        String st="the quick brown fox jumps over a lazy hungary dog";
        StringTokenizer stToken=new StringTokenizer(st);
        String stWords;
        while(stToken.hasMoreTokens())
        {
            stWords=stToken.nextToken();
            System.out.println(stWords);
        }
        
    }
}
