public class FinalMethod 
{ 
    final int a = 50; 
    FinalMethod()
    { 
        System.out.println("This is a default constructor"); 
    } 

    final void display()
    { 
        System.out.println("Value of a: " +a); 
    } 
} 
public class FinalMethodSubclass extends FinalMethod
{ 
    void display()
    { 
        // Compile time error because we cannot override the final method from FinalMethodEx. 
        System.out.println("This is the final method of FinalMethodEx class"); 
    }

    public static void main(String[] args)   
    { 
        // Create an object of FinalMethodEx class. 
        FinalMethod ob = new FinalMethod(); 

        // Call final method using reference variable fm. 
        ob.show(); 
    } 
}