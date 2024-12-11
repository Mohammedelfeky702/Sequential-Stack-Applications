public class Stack {
private int maxsize;  
public  int top;
private char [] stackArray;

public Stack(int size) {    
  this.maxsize = size;
  this.top = -1;
  this.stackArray = new char[maxsize];
}

public void push(char element) {
    if (isFull()) {
        System.out.println("Stack Overflow. Cannot push " + element);
        return;
    }
    stackArray[++top] = element;
    System.out.println(element + " pushed to stack");
}

public char pop() {
    if (isEmpty()) {
        System.out.println("Stack Underflow. Cannot pop");
        return '\0';
    }
    return stackArray[top--];
    
}

public char peek() {
if (isEmpty()) {
    System.out.println("Stack Underflow. Cannot peek");
    return '\0';
} else{
    return stackArray[top];
}

}
public boolean isEmpty() {
    return (top == -1);
}

public boolean isFull() {
    return (top == maxsize - 1);
}

}