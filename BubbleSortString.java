public class BubbleSortString
{
    public static void main()
    {
        String n[]={"Zahid", "Mohit","Krish","Sumit","Ladla","Amar","Akbar"};
        int i,j;
        String t;
        System.out.println("Before Sorting");
        for(i=0;i<7;i++)
        {
            System.out.println(n[i]);
        }
        for(i=0; i<6; i++)
        {
            for(j=0; j<6-i; j++)
            {
                if(n[j].compareTo(n[j+1])>0)
                {
                    t=n[j];        // t="Zahid"
                    n[j]=n[j+1];   // n[0]="Mohit"
                    n[j+1]=t;      // n[1]="Zahid"
                }
            }
        }
        System.out.println("After Sorting");
        for(i=0;i<7;i++)
        {
            System.out.println(n[i]);
        }
    }
}
