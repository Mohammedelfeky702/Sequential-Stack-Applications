import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      /* 
        Stack stack = new Stack(5);
        stack.push('A');
        stack.push('B');
        stack.push('C');
        System.out.println("Top of stack: " + stack.peek());
        stack.pop();
        System.out.println("Popped element "+stack.peek());
        System.out.println("Top of stack: " + stack.peek());


String expresstion1="{[()]}";
String expresstion2="{[(])]}";
String expresstion3="{[()";

System.out.println("Expresstion "+expresstion1 +"->"+(isBalanced(expresstion1)?"Balanced":"Not Balanced"));
*/
      Scanner sc = new Scanner(System.in);
      boolean run = true;

      System.out.println("Please enter the stack size");
      Stack s = new Stack(80);

      while (run) {
        System.out.println("\n=========== eChoose an option ===========\n");
        System.out.println("A) Re-nitialize the stack");
        System.out.println("B) Push to the stack");
        System.out.println("C) Pop from the stack");
        System.out.println("D) Peek at the top element");
        System.out.println("E) Check an expression");
        System.out.println("F) Exit");

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
            char element = sc.next().charAt(0);
            sc.nextLine();
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
            System.err.print("Enter the expression to check: ");
            String expresstion = sc.nextLine();
            System.out.println("Expresstion "+ expresstion +" is "+(BalancedParenthesisChecker.isBalanced(expresstion)?"balanced":"NOT balanced"));
            break;
          case "F":
            run = false;
            break;
          default:
            System.out.println("Unknown command");
            break;
        }
      }
    }
}
