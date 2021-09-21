import java.util.*;
// Linear Search
public class Array1
{
    public static void main(String args[])
    {
        String name[]={"Rohit", "Kholi", "Dhoni", "Sachin", "Rahul", "Siraj", "Bumrah", "Shami"}; 
        String city[]={"Mumbai", "Delhi", "Rachi", "Mumbai", "Bangalore", "Hyderabad", "Mumbai", "Patna"};
        int m1[]={88, 50, 60, 54, 70, 50, 90, 20};
        int m2[]={80, 50, 80, 94, 70, 50, 90, 30};
        int m3[]={82, 80, 60, 54, 70, 50, 90, 20};
        String s, grade="";
        int i, f=0, pos=-1, l, avg;
        l=name.length;
        for(i=0; i<l; i++)
        {
            System.out.print(name[i] + " ");
        }
        Scanner sc=new Scanner(System.in);       
        System.out.println("\nEnter a name to search");
        s=sc.nextLine(); 
        System.out.println("Output");
        for(i=0; i<l; i++)
        {
            if(s.compareTo(name[i])==0)
            {
                f=1;
                pos=i;
                break;
            }
        }
        if(f == 1)
        {
            avg=(m1[pos] + m2[pos] + m3[pos])/3;
            if(avg>=60)
            {
                grade="First Division";
            }
            else if(avg>=50 && avg<60)
            {
                grade="Second Division";
            }
            else if(avg>=40 && avg<50)
            {
                grade="Third Division";
            }
            else
            {
                grade="Fail, buy a Toto";
            }
            System.out.println(s + " live's in " + city[pos] + " and he stood " + grade);
        }
        else
        {
            System.out.println("Not Found");
        }
    }       
}

