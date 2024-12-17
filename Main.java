import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      boolean run = true;

      System.out.println("Please enter the stack size");
      Stack s = new Stack(80);

      while (run) {
        System.out.println("\n=========== Choose an option ===========\n");
        System.out.println("A) Re-initialize the stack");
        System.out.println("B) Push to the stack");
        System.out.println("C) Pop from the stack");
        System.out.println("D) Peek at the top element");
        System.out.println("E) Check an expression");
        System.out.println("F) Reverse a string");
        System.out.println("G) Check if stack is full");
        System.out.println("H) Check if stack is empty");
        System.out.println("I) Exit");

        String input = sc.nextLine();
        input = input.toUpperCase();
        switch(input) {
          case "A":
            System.out.print("Please enter the stack size: ");
            int size = sc.nextInt();
            sc.nextLine();
            s = new Stack(size);
            break;
          case "B":
            System.out.print("Please enter the element you want to push: ");
            String element = sc.nextLine();
            s.push(element);
            break;
          case "C":
            Object c = s.pop();
            if (s.is_empty()) {
              System.out.println("The stack is empty");
              break;
            }
            System.out.print(c + " has been popped");
            break;
          case "D":
            if (s.is_empty()) {
              System.out.println("The stack is empty");
              break;
            }
            Object top = s.peek();
            System.out.print(top + " is at the top of the stack");
            break;
          case "E":
            System.out.print("Enter the expression to check: ");
            String expression = sc.nextLine();
            System.out.println("Expression "+ expression +" is "+(BalancedParenthesisChecker.isBalanced(expression)?"balanced":"NOT balanced"));
            break;
          case "F":
          System.out.print("Enter the string to reverse: ");
          String string = sc.nextLine();
          System.out.println("String "+ string +" reversed is "+(StringInversion.inverseString(string)));
          break;
          case "G":
            System.out.println("Stack is "+(s.is_full()?"full":"not full"));
            break;
          case "H":
          System.out.println("Stack is "+(s.is_empty()?"empty":"not empty"));
          break;
          case "I":
            run = false;
            break;
          default:
            System.out.println("Unknown command");
            break;
        }
      }
    }
}
