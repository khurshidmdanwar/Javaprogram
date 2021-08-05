import java.io.*;
public class BinarySearchWithSorting
{
    public static void main(String args[]) throws IOException
    {
        String name[] = new String[20];
        String s, t;
        int i,f=0,j;
        int low, high, mid, pos;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter 10 Names in array:");
        for(i=0;i<10;i++)
        {
            name[i] = br.readLine();
        }
        System.out.println("Enter name to Search:");
        s = br.readLine();
        // Sorting of array
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(name[j].compareTo(name[j+1])>0)
                {
                    t = name[j];
                    name[j] = name[j+1];
                    name[j+1] = t;
                }
            }
        }
        System.out.println("Sorted array:");
        for(i=0;i<10;i++)
        {
            System.out.print(name[i] + " ");
        }
        // Binary Search
        high=10;
        low=0;
        pos=0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(s.compareTo(name[mid])<0)
            {
                high = mid - 1;
            }
            else if(s.compareTo(name[mid])>0)
            {
                low = mid + 1;
            }
            else if(s.compareTo(name[mid])==0)
            {
                pos = mid + 1;
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("\n Successful");
            System.out.println(s+" is located at " + pos);
        }
    }
}