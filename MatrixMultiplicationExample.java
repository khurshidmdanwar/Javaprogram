public class MatrixMultiplicationExample
{  
    public static void main(String args[])
    {  
        //creating two matrices    
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};    

        //creating another matrix to store the multiplication of two matrices    
        int c[][]=new int[3][3];  //3 rows and 3 columns  
        int i, j, k;
        System.out.println("First Matrix");
        for(i=0; i<3 ; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");  //printing matrix element  
            }
            System.out.println();
        }
         System.out.println("Second Matrix");
        for(i=0; i<3 ; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(b[i][j]+" ");  //printing matrix element  
            }
            System.out.println();
        }
        //multiplying and printing multiplication of 2 matrices    
        for(i=0;i<3;i++)
        {    
            for(j=0;j<3;j++)
            {    
                c[i][j]=0;      
                for(k=0;k<3;k++)      
                {      
                    c[i][j]= c[i][j] + a[i][k]*b[k][j];      
                }//end of k loop  
                
            }//end of j loop  
            //System.out.println();//new line    
        }  
         System.out.println("Final Matrix");
        for(i=0; i<3 ; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(c[i][j]+" ");  //printing matrix element  
            }
            System.out.println();
        }
    }
}  