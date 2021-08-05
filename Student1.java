public class Student1
{
   private String name;
   private String city;
   private int roll; //POJO
   void input(String name, String city, int roll)
   {
       this.name=name;
       this.city=city;
       this.roll=roll;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(city);
        System.out.println(roll);
    }
}
