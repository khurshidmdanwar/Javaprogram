import java.util.*;
public class TowDArray
{
    public static void main(String args[])
    {
       // int n[][]={{1,2,3},{9,8,7},{4,5,6}};
       int n[][]= new int[3][3];
       Scanner sc=new Scanner(System.in);
        int i, j,s;
        System.out.println("Enter values:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j]=sc.nextInt();
            }            
        }
        System.out.println("Output");
         
        for(i=0;i<3;i++)
        {
           s=0;
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+ " ");
                s=s+n[j][i];
            }
            System.out.println(s);
            //System.out.println();
        }
    }
}
