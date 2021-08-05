public class DDtoSingleArray
{
    public static void main(String champa[])
    {
        int n[][]={{1,2,3},{9,8,7},{4,5,6}};
        int k=0;
        // int n[][]= new int[3][3];
        int no[]=new int[9];
        int i, j;
        System.out.println("Before Convertion");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j] + " ");
            }            
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                no[k]=n[i][j];
                k++;
            }            
        }
        System.out.println("After Convertion");
        for(i=0; i<k; i++)
        {            
            System.out.print(no[i] + " ");
        }
    }
}
