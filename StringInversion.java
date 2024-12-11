public class StringInversion {
    public static String inverseString(String input){
        Stack stack = new Stack(input.length());

        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
}

public static void main (String[] args) {
    String input = "hello";
    String reversed = inverseString(input);
    System.out.println("Reversed String: " + reversed);  
}
}
