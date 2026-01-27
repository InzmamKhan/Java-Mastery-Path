public class C_C_Expressions {

    static class Node {
        char data;
        int val; // Used for evaluation
        Node next;

        // Constructor for Characters (Conversion/Matching)
        Node(char data) {
            this.data = data;
            this.next = null;
        }
        // Constructor for Integers (Evaluation)
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node top;

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public char popChar() {
        if (top == null) return '\0';
        char d = top.data;
        top = top.next;
        return d;
    }

    public int popInt() {
        if (top == null) return -1;
        int v = top.val;
        top = top.next;
        return v;
    }

    public boolean isEmpty() { return top == null; }

    // --- LOGIC FUNCTIONS ---

    // 1. Parenthesis Matching
    public static boolean isBalanced(String expr) {
        C_C_Expressions stack = new C_C_Expressions();
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char last = stack.popChar();
                if ((ch == ')' && last != '(') || 
                    (ch == '}' && last != '{') || 
                    (ch == ']' && last != '[')) return false;
            }
        }
        return stack.isEmpty();
    }

    // 2. Infix to Postfix
    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        C_C_Expressions stack = new C_C_Expressions();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.top.data != '(')
                    result.append(stack.popChar());
                stack.popChar(); // Remove '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.top.data)) {
                    result.append(stack.popChar());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) result.append(stack.popChar());
        return result.toString();
    }

    // 3. Infix to Prefix
    public static String infixToPrefix(String exp) {
        StringBuilder rev = new StringBuilder(exp).reverse();
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '(') rev.setCharAt(i, ')');
            else if (rev.charAt(i) == ')') rev.setCharAt(i, '(');
        }
        String postfix = infixToPostfix(rev.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    // 4. Infix Evaluation
    public static int evaluateInfix(String exp) {
        C_C_Expressions values = new C_C_Expressions();
        C_C_Expressions ops = new C_C_Expressions();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                values.push(c - '0');
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (ops.top.data != '(')
                    values.push(applyOp(ops.popChar(), values.popInt(), values.popInt()));
                ops.popChar();
            } else {
                while (!ops.isEmpty() && precedence(ops.top.data) >= precedence(c))
                    values.push(applyOp(ops.popChar(), values.popInt(), values.popInt()));
                ops.push(c);
            }
        }
        while (!ops.isEmpty()) 
            values.push(applyOp(ops.popChar(), values.popInt(), values.popInt()));
        return values.popInt();
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

    private static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Postfix: " + infixToPostfix("a+b*c"));
        System.out.println("Prefix: " + infixToPrefix("a+b*c"));
        System.out.println("Is Balanced: " + isBalanced("{[()]}"));
        System.out.println("Evaluation (2+3*4): " + evaluateInfix("2+3*4"));
    }
}