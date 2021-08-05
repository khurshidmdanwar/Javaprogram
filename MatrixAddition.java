public class MatrixAddition
{
    public static void main(String args[])
    {
        int n1[][]={{2,3,4,5},{5,4,3,1},{8,7,6,5},{5,4,3,1}};
        int n2[][]={{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5}};
        int n3[][]=new int[4][4];
        int i,j;
        System.out.println("Array 1");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array 2");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n2[i][j] + " ");
            }
            System.out.println();
        }
        // Addition of two Matrix
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                n3[i][j] = n1[i][j] + n2[i][j];
            }           
        }
        System.out.println("Array 3 Addition of two Matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
