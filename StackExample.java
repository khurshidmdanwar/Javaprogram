public class StackExample 
{
    private static final int capacity = 4;
    int arr[] = new int[capacity];
    int top = -1;
    public void push(int pushedElement) 
    {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Element " + pushedElement + " is pushed to Stack !");
            printElements();
        } else {
            System.out.println("Stack Overflow !");
        }
    }
    public void pop() {
        if (top >= 0) {
            top--;
            System.out.println("Pop operation done !");
        } else {
            System.out.println("Stack Underflow !");
        }
        printElements();
    }

    public void printElements() {
        if (top >= 0) {
            System.out.println("Elements in stack :");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) 
    {
        StackExample stackDemo = new StackExample();     
        stackDemo.push(9);
        stackDemo.push(2);
        stackDemo.push(7);
        stackDemo.push(6);
        //stackDemo.push(9);
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
       // stackDemo.pop();
    }
}