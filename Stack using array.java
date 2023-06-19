public class Stack {
    int maxSize;
    int top;
    int stackArray[];

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
        //System.out.println("Constructor");
    }
    public void push(int value) {
        if (top==maxSize-1) {
            System.out.println("Stack is full. Cannot push element.");
        }
        else{
            stackArray[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }
    public void pop()
    {
        if (top==-1) {
            System.out.println("Stack is empty. Cannot pop element.");
        }
        else{
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack.");
        }
    }
    public void peek() {
        if (top==-1) {
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println(stackArray[top]+" is at top");
        }
    }
    public void isFull() 
    {
        if(top==maxSize-1)
            System.out.println("Stack is full");
        else
            System.out.println("Stack is not Full");
    }
    public void isEmpty()
    {
        if(top==-1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is not empty");
    }
    public static void main(String[] args) {
        int size=5;
        Stack stack = new Stack(size);
        stack.isEmpty();
        stack.isFull();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
