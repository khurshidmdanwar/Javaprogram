public class Product
{
    String name;
    int code;
    double amount;
    public Product(String n, int c, double p)
    {
        name=n;
        code=c;
        amount=p;
    }
    void show()
    {
        System.out.println("Product Name    :"+name);
        System.out.println("Product Code    :"+code);
        System.out.println("Product Amount  :"+amount);
    }         
}
