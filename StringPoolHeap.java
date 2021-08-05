public class StringPoolHeap
{
    public static void main(String args[])
    {
        String a = "Java";
        String b = "Java";
        System.out.println(a == b);  // True

        //Here two different objects are created and they have different references:

        String c = new String("Java"); // c and d are an object
        String d = new String("Java");
        System.out.println(c == d);  // False

        //Similarly when you compare a String literal with an String object created using new() operator using == operator, it will return false, as shown below :

        String e = "JDK";
        String f =  new String("JDK");
        System.out.println(e == f);  // False

    }

}
