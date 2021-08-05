import java.io.*;
import java.util.*;
public class ReadData
{
    public static void main(String args[])throws IOException
    {
        int i, roll, totMark,clas;
        String name, div;
        Scanner sc=new Scanner(new File("student.dat"));
        System.out.println("Roll \t Name \t Class \t Total Marks\t Division");
        System.out.println("======================================================");
        while(sc.hasNext())
        {
            roll=sc.nextInt();
            name=sc.next();
            clas=sc.nextInt();
            totMark=sc.nextInt();
            if(totMark>=450)
             div="First";
            else if(totMark>=400)
             div="Second";
            else
             div="Third";
            System.out.println(roll + "\t" + name + "\t" + clas +"\t\t" + totMark + "\t\t" + div);
        }
    }
}