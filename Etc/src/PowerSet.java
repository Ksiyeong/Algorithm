import java.util.Stack;

public class PowerSet {
    private static final char[] characters = {'A', 'B', 'C'};

    public static void main(String[] args) {
        final Stack<Character> stack = new Stack<>();
        search(stack, 0);
    }

    private static void search(Stack<Character> stack, int k) {
        if (k >= characters.length) {
            System.out.println(stack.toString());
        } else {
            stack.push(characters[k]);
            search(stack, k + 1);

            stack.pop();
            search(stack, k + 1);
        }
    }
}