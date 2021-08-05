public class DDEvenPrint
{
    public static void main(String args[])
    {
        int n[][]={{1,2,4,5},{6,7,8,9},{3,5,4,7},{8,7,9,2}};
        int i,j;
        System.out.println("Before Processing");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
        // Processing 
        System.out.println("After Processing");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(n[i][j]%2==0)
                    System.out.print(n[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

