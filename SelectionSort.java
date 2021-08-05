public class SelectionSort
{
    public static void main()
    {
        int n[]={9,6,8,5,2};
        int i,j, t;
        System.out.println("Before Sorting");
        for(i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
        for(i=0; i<4; i++)
        {
            for(j=i+1; j<5; j++)
            {
                if(n[i]>n[j])
                {
                    t=n[i];
                    n[i]=n[j];
                    n[j]=t;
                }
            }
        }
        System.out.println("After Sorting");
        for(i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
    }
}
