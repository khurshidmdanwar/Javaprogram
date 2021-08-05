import java.util.*;
class Sum_Series
{
	int x,n;
	double sum=0;
	Scanner sc = new Scanner(System.in);
	Sum_Series()
	{
		x=0;
		n=0;
		sum=0;
	}
	void readLimit()
	{
		System.out.println("Enter the value of x and total number if item in n ");
		x=sc.nextInt();
		n=sc.nextInt();
	}
	int getPower (int m, int p)
	{
		if(p==0)
			return 1;
		else
			return m* getPower(m,p-1);
	}
	void sum ()
	{
	    int i, l=11;
		for(i=1;i<=n;i++)
		{
			int a = getPower(x,((i*2)/l));
			l=l+1;
			sum =sum+a;
		}
		System.out.println("S = " + sum);
	}
	public static void main(String args[])
	{
		Sum_Series ob = new Sum_Series();
		ob.readLimit();
		ob.sum();
	}
}