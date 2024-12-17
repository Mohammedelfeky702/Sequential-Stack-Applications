import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  
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
        System.out.println("F) Reverse a string");
        System.out.println("G) Exit");

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
          System.err.print("Enter the string to reverse: ");
          String string = sc.nextLine();
          System.out.println("String "+ string +" reversed is "+(StringInversion.inverseString(string)));
          break;
          case "G":
            run = false;
            break;
          default:
            System.out.println("Unknown command");
            break;
        }
      }
    }
}
