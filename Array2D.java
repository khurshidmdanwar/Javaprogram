import java.util.*;
public class Array2D
{
    public static void main(String args[])
    {
        //int n[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter elements in 2D Array");
        for(i=0;i <3; i++)
        {
            for(j=0; j<3; j++)
            {
                n[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display 2D array elements");
        for(i=0 ;i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
