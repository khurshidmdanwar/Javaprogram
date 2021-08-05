import java.io.*;
public class ReadTextFile
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin=new FileInputStream("capital.txt");
        int p;
        while((p=fin.read())!=-1)
        {
            System.out.print((char)p);
        }
        fin.close();
    }
}
