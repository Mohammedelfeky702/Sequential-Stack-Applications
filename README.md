# Balanced Parenthesis and String Inversion Using Stack

## Project Overview
This project implements stack-based solutions for two problems:

1. **Balanced Parenthesis Check**: Verifies if parentheses in a given string are balanced using stack operations.
2. **String Inversion**: Reverses a given string using a stack.

Both implementations utilize a custom stack class built with sequential allocation in Java.

---

## Features
### 1. Balanced Parenthesis Check
- Checks if strings containing parentheses (`()`, `{}`, `[]`) are balanced.
- Returns `true` if balanced, otherwise `false`.
- Example:
  - Input: `{[()]}`
  - Output: Balanced

### 2. String Inversion
- Reverses a string of any length (up to 80 characters) using a stack.
- Supports all types of characters, including alphabets, numbers, and special characters.
- Example:
  - Input: `Hello, World!`
  - Output: `!dlroW ,olleH`

---

## How It Works
### The Stack Class
The `Stack` class provides basic stack operations:
- **Create**: Initializes an empty stack.
- **Push**: Adds an element to the stack.
- **Pop**: Removes and returns the top element of the stack.
- **Peek**: Returns the top element without removing it.
- **IsEmpty**: Checks if the stack is empty.
- **IsFull**: Checks if the stack is full.

---

## File Structure
- **`Stack.java`**: Contains the `Stack` class implementation.
- **`BalancedParenthesisChecker.java`**: Implements the balanced parenthesis check functionality.
- **`StringInversion.java`**: Implements the string inversion functionality.

---

## How to Run
1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate to the project directory and compile the Java files:
   ```bash
   javac Stack.java BalancedParenthesisChecker.java StringInversion.java
   ```
3. Run the desired functionality:
   - For balanced parenthesis check:
     ```bash
     java BalancedParenthesisChecker
     ```
   - For string inversion:
     ```bash
     java StringInversion
     ```

---

## Example Output
### Balanced Parenthesis Checker
Input: `{[()]} {[(])} ([{}])`
```
Expression: {[()]} -> Balanced
Expression: {[(])} -> Not Balanced
Expression: ([{}]) -> Balanced
```

### String Inversion
Input: `"Hello, World!"`
```
Original: Hello, World! -> Reversed: !dlroW ,olleH
```

---

## Contribution
Feel free to fork this repository and submit pull requests for any improvements or additional features.

