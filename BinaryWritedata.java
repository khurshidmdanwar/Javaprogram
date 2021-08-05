import java.io.*;
public class BinaryWritedata
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(r);
        FileOutputStream fout=new FileOutputStream("abc.dat");
        DataOutputStream ffout=new DataOutputStream(fout);
        int n, i, q, pr;
        String str, pc;
        System.out.println("Enter number of products:");
        n=Integer.parseInt(in.readLine());
        for(i=0; i<n; i++)
        {
            System.out.println("Enter product name:");
            str=in.readLine();
            System.out.println("Enter product code:");
            pc=in.readLine();
            System.out.println("Enter Quantity :");
            q=Integer.parseInt(in.readLine());
            System.out.println("Enter Price :");
            pr=Integer.parseInt(in.readLine());
            ffout.writeUTF(str);
            ffout.writeUTF(pc);
            ffout.writeInt(q);
            ffout.writeInt(pr);
        }
        fout.close();
        ffout.close();
    }
}
