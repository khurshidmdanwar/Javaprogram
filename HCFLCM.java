public class HCFLCM
{
    int div, divd, rem,lcm,hcf;

    int hcfFunc(int x, int y)
    {
        divd=x;
        div=y;       
        rem=divd % div;
        while(rem!=0)
        {
            divd=div;
            div=rem;
            rem=divd % div;              
        }
        return div;
    }

    int lcmFunc(int x, int y, int z)
    {
        lcm=(x * y)/z;
        return lcm;
    }

    public static void main(String args[])
    {

        int a, b, h, l;
        a=10;
        b=4;
        HCFLCM ob=new HCFLCM();
        h=ob.hcfFunc(a, b);
        System.out.println("HCF=" + h);
        l=ob.lcmFunc(a, b, h);
        System.out.println("LCM=" + l);
    }
}
