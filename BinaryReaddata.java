import java.io.*;
public class BinaryReaddata
{
    public static void main(String args[])throws IOException
    {
        // InputStreamReader r=new InputStreamReader(System.in);
        // BufferedReader in=new BufferedReader(r);
        FileInputStream fin=new FileInputStream("abc.dat");
        DataInputStream ffin=new DataInputStream(fin);
        int n, i, q, pr;
        String str, pc;
        // System.out.println("Enter number of products:");
        // n=Integer.parseInt(in.readLine());
       boolean eof=false;
       System.out.println("Code\tName\tQuantity\tPrice");
       while(!eof)
       {
           try
           {
               str=ffin.readUTF();
               pc=ffin.readUTF();
               q=ffin.readInt();
               pr=ffin.readInt();
              System.out.println(pc + "\t" + str + "\t" + q + "\t\t" + pr);
            }
            catch(EOFException e)
            {
                System.out.println("End of file ");
                eof=true;
            }
        }
        ffin.close();
        fin.close();
        
    }
}