

public class CircularQueue {
     
    private int [] arr;
    private int capacity;
    private int front;
    private int size;


    public CircularQueue(int c)

    {
        arr = new int[c];
        capacity = c;
        front = 0;
        size = 0;
    }

    public int frontElement()
    {
        if (size == 0) {
            return -1;
                       
        }

        return arr[front];
    }

    public int rearElement()
    {
        if(size == 0)
        {
            return -1;
        }

        int rear = (front + (size -1))% capacity;
        return arr[rear];

    }

    public void enQueue(int x)
    {
       

        if(size == capacity)
        {
            return ;
        }
        int rear = (front + size)% capacity;
        arr[rear] = x;
        size ++;




    }

    public int deQueue()
    {
        if(size == 0)
        {
            return -1;

        }
        int frontend = arr[front];
        front = (front + 1) % capacity;
        
        size --;
        return frontend;
    }



    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enQueue(1);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.deQueue();
        cq.deQueue();
        
        System.out.println(cq.frontElement()+ " "+ cq.rearElement());
        


        


    }

}
