import java.io.*;
public class WriteTextFile
{
   public static void main(String args[]) throws IOException
   {
       byte cap[]={'R','A','N','C','H','I',' ', 'D','E','L','H','I',' ','K','O','L','K','A','T','A',' ', 'P', 'A'};
       FileOutputStream fout=new FileOutputStream("capital.txt");
       fout.write(cap);
       fout.close();
    }
}
