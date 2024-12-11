public class BalancedParenthesisChecker {
    public static boolean isBalanced (String expString) {
        Stack stack = new Stack(expString.length());
    
    for (int i = 0; i < expString.length(); i++) {
        char ch = expString.charAt(i);
        
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        } else if (ch == ')' || ch == '}' || ch == ']') {
            if (stack.is_empty()){
                return false;
            }
            char top = (Character)stack.pop();
            if(!isMatchingPair(top,ch)) {
                return false;
        
    }
}
    } 
    return stack.is_empty();
}

private static boolean isMatchingPair(char open, char close) {
    if (open == '(' && close == ')') {
        return true;
    } else if (open == '{' && close == '}') {
        return true;
    } else if (open == '[' && close == ']') {
        return true;
    }
    return false;
}


}
