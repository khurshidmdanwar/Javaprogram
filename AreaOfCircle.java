import java.util.*;
public class AreaOfCircle
{
    double area;
    double areaOfCircle(double radius)
    {
        area=Math.PI * radius * radius;
        return area;
    }

    public static void main(String args[])
    {
        double rad, area;
        Scanner sc=new Scanner(System.in);
        AreaOfCircle ob=new AreaOfCircle();
        System.out.println("Enter radius:");
        rad=sc.nextDouble();
        area=ob.areaOfCircle(rad);
        System.out.println("Area of circle="+area);
    }
}
