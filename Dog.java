public class Dog implements Animal, Eat 
{
    public void sound()
    {
        System.out.println("Dog Bark wo wo");
    }
    public void eat()
    {
        System.out.println("Meat");
    }
   // void eat()
   public static void main(String args[])
   {
       Animal ob=new Dog();
       Eat ob1=new Dog();
       ob.sound();
       ob1.eat();
    }
}
