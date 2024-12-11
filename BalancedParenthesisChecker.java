public class BalancedParenthesisChecker {
    public static boolean isBalanced (String expString) {
        Stack stack = new Stack(expString.length());
    
    for (int i = 0; i < expString.length(); i++) {
        char ch = expString.charAt(i);
        
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        } else if (ch == ')' || ch == '}' || ch == ']') {
            if (stack.isEmpty()){
                return false;
            }
            char top =stack.pop();
            if(!isMatchingPair(top,ch)) {
                return false;
        
    }
}
    } 
    return stack.isEmpty();
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
