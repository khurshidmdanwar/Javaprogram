import java.util.*;
class Test
{ 
    public static void main(String args[ ]) 
    { 
        int n;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number: "); 
        n = sc.nextInt(); 
        Series obj = new Series(n); 
        obj.calcSum(); 
        obj.display(); 
    } 
}