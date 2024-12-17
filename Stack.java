public class Stack {
    private int max = 80;
    private int top = -1;
    private boolean overflow = false;
    private boolean underflow = false;
    private Object[] data = new Object[max];

    public Stack() {

    }

    public Stack(int max) {
        this.max= max;
    }

    public int getTop() {
        return top;
    }
    
    public boolean is_empty() {
        return this.top == -1;
    }

    public boolean is_full() {
        return this.top == max-1;
    }

    public Object peek() {
        if (top==-1) {
            return 0;
        }
        return data[top];
    }

    public void push(Object o) {
        if (is_full()) {
            overflow = true;
            System.out.println("An overflow has occurred");
        }
        else {
            System.err.println("pushing "+ o);
            overflow = false;
            this.top += 1;
            data[top] = o;
        }
    }

    public Object pop() {
        if (is_empty()) {
            underflow = true;
            System.out.println("An underflow has occurred");
            return null;
        }
        else {
            underflow = false;
            Object element = data[top];
            System.err.println("popping "+ element);
            this.top -= 1;
            return element;
        }
    }

}