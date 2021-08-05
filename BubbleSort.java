public class BubbleSort
{
    public static void main()
    {
        int n[]={9,6,5,8,2, 4,5,12,13,10,22,33,21,55,13,43,57,90,67,34};
        int n1[]=new int[10];
        int n2[]=new int[10];
        int i,j, t,temp=0;
        System.out.println("Before Sorting");
        for(i=0;i<20;i++)
        {
            System.out.println(n[i]);
        }
        temp=0;
        for(i=0;i<10;i++)
        {
            n1[temp]=n[i];
            temp++;
        }
        temp=0;
        for(i=10;i<20;i++)
        {
            n2[temp]=n[i];
            temp++;
        }
        for(i=0; i<9; i++)
        {
            for(j=0; j<9-i; j++)
            {
                if(n1[j]>n1[j+1])
                {
                    t=n1[j];         // t=9
                    n1[j]=n1[j+1];    // n[0]=8
                    n1[j+1]=t;       // n[1]=9
                }
            }
        }
        for(i=0; i<9; i++)
        {
            for(j=0; j<9-i; j++)
            {
                if(n2[j]<n2[j+1])
                {
                    t=n2[j];         // t=9
                    n2[j]=n2[j+1];    // n[0]=8
                    n2[j+1]=t;       // n[1]=9
                }
            }
        }
        temp=0;
        for(i=0;i<10;i++)
        {
            n[temp]=n1[i];
            temp++;
        }
        for(i=0;i<10;i++)
        {
            n[temp]=n2[i];
            temp++;
        }
        System.out.println("After Sorting");
        for(i=0;i<20;i++)
        {
            System.out.println(n[i]);
        }
    }
}
