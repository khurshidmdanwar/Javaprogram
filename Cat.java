public class Cat implements Animal 
{
    public void sound()
    {
        System.out.println("Cat mew mew");
    }
   // void eat()
   public static void main(String args[])
   {
       Animal ob=new Cat();
       ob =new Dog();
       ob.sound();
    }
}
