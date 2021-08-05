public class Sales extends Product
{
    int day;
    double tax, totamount, fine, amt;
    public Sales(String name, int code, double amount, int day)
    {
        super(name,code,amount);
        this.day=day;          
    }
    void compute()
    {
        tax=amount*12.4/100.0;
        if(day>30)
            fine=amount*0.025;
        totamount=amount + tax + fine;        
    }
    void show()
    {
        super.show();
        System.out.println("Total Amount :"+totamount);
      
    }

    public static void main(String args[])
    {
        Sales ob1=new Sales("Laptop", 1001, 34500.0, 40);
        Sales ob2=new Sales("Printer", 1002, 4500.0, 40);
        ob1.compute();
        ob1.show();
        ob2.compute();
        ob2.show();
    }

}
