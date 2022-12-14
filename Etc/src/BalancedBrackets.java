import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        boolean output = balancedBrackets("(");
        System.out.println(output); // // -> false

        output = balancedBrackets("()");
        System.out.println(output); // --> true

        output = balancedBrackets("[](){}");
        System.out.println(output); // --> true

        boolean output2 = balancedBrackets("[({})]");
        System.out.println(output2); // --> true

        boolean output3 = balancedBrackets("[(]{)}");
        System.out.println(output3); // --> false

        System.out.println("----custom----");
        System.out.println(balancedBrackets("[[][]][]()({[()][]})"));
    }

    public static boolean balancedBrackets(String str) {
        // TODO:
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (stack.size() > 0) {

                if (str.charAt(i) == ')') {
                    if (stack.pop() == '(') {
                        continue;
                    } else{ return false;}

                } else if (str.charAt(i) == ']') {
                    if (stack.pop() == '[') {
                        continue;
                    }else{ return false;}

                } else if (str.charAt(i) == '}') {
                    if (stack.pop() == '{') {
                        continue;
                    }else{ return false;}

                }
            }

            stack.push(str.charAt(i));

        }

        return stack.size() == 0;
    }


}
