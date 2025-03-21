public class Stack{

    int top;
    int cap;
    int [] arr;


    public Stack(int cap)
    {
        this. cap = cap;
        top = -1;
        arr = new int[cap];
    }

    public boolean push(int x)
    {
        if(top >= cap -1)
        {
            System.out.println("overflow");
            return false;
        }
        arr[++top] = x;
        return true;

    }

    public int pop()
    {
        if(top < 0)
        {
            System.out.println("Underflow");
            return 0;

        }
        return arr[top--];
    }

    public int  peek()
    {
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    public boolean isEmpty()
    {
        
        return top < 0;

    }

    

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(2);
        s.push(5);
        s.push(10);
        System.out.println("poped from stack last element "+s.pop());
        System.out.println("peek the top element "+s.peek());
        System.out.println("peek all element ");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
      

    }
}