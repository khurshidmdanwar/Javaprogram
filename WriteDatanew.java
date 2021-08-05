import java.io.*;
import java.util.*;
public class WriteDatanew
{
    public static void main(String args[])throws IOException
    {
        FileWriter fout=new FileWriter("student.dat");
        BufferedWriter ffout=new BufferedWriter(fout);
        PrintWriter ob=new PrintWriter(ffout);
        Scanner sc=new Scanner(System.in);
        int i, roll, totMark,clas;
        String name;
        System.out.println("Enter Roll, Name, Class and Total Marks of Student:");
        for(i=0;i<2;i++)
        {
            roll=sc.nextInt();
            name=sc.next();
            clas=sc.nextInt();
            totMark=sc.nextInt();
            ob.println(roll);
            ob.println(name);
            ob.println(clas);
            ob.println(totMark);
        }
        ob.close();
        ffout.close();
        fout.close();
        
    }
}
       