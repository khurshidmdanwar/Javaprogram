public class ReportCards
{
    public static void main(String args[])
    {
        String name[]={"Rohit", "Kholi", "Dhoni", "Sachin", "Rahul", "Siraj", "Bumrah", "Shami"}; 
        String city[]={"Mumbai", "Delhi", "Rachi", "Mumbai", "Bangalore", "Hyderabad", "Mumbai", "Patna"};
        int m1[]={48, 51, 60, 54, 40, 50, 70, 40};
        int m2[]={80, 50, 80, 94, 70, 50, 90, 30};
        int m3[]={82, 80, 60, 54, 70, 50, 90, 20};
        String s, grade="";
        int i, f=0, pos=-1, l, avg, max=-9999, total=0;
        l=name.length;
        System.out.println("Name\t\tCity\t\tAverage\tGrade");
        for(i=0; i<l; i++)
        {
            // Highest total checking
            total=m1[i] + m2[i] + m3[i];
            if(total>max)
            {
                max=total;
                pos=i;
            }
            
            avg=(m1[i] + m2[i] + m3[i])/3;
            
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
            System.out.println(name[i] + "\t\t" + city[i] + "\t\t\t" + avg + "\t" + grade);
           // System.out.printf("%s \t\t %s\t\t %d \t %s\n", name[i], city[i], avg, grade);
        }
        System.out.println("Highest number scored by " + name[pos] + " and Total " + max);
    }
}       

