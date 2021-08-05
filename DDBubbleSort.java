import java.util.*;
public class DDBubbleSort
{
    public static void main(String args[])
    {
       // int n[][]={{1,2,3},{9,8,7},{4,5,6}};
       int n[][]= new int[3][3];
       int no[]=new int[9];
       Scanner sc=new Scanner(System.in);
        int i, j,s ,t;
        System.out.println("Enter values:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j]=sc.nextInt();
            }            
        }
        System.out.println("Output Before Sorting");
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j] + " ");
            }  
            System.out.println();
        }
       // Convert to single dimention array  
       s=0; 
       for(i=0;i<3;i++)
        {
           
            for(j=0;j<3;j++)
            {
                no[s]=n[i][j];
                s++;
            }            
        }
        // Bubble sort
        for(i=0; i<8;i++)
        {
            for(j=0; j<8-i; j++)
            {
                if(no[j]>no[j+1])
                {
                    t=no[j];
                    no[j]=no[j+1];
                    no[j+1]=t;
                }
            }
        }
        // Convert to Double dimention array  
        s=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j]=no[s];
                s++;
            }            
        }
        System.out.println("Output after sorting");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j] + " ");
            }  
            System.out.println();
        }
    }
}
