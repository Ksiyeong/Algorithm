import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = read();
        tree = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char[] readLine = bf.readLine().toCharArray();
            tree.put(readLine[0], new Node(readLine[2], readLine[4]));
        }

        solution('A');
        bw.write(preorder + "\n");
        bw.write(inorder + "\n");
        bw.write(postorder.toString());
        bw.flush();
        bw.close();
    }

    private static class Node {
        char left;
        char right;

        public Node(char left, char right) {
            this.left = left;
            this.right = right;
        }
    }

    static Map<Character, Node> tree;
    static StringBuilder preorder = new StringBuilder();
    static StringBuilder inorder = new StringBuilder();
    static StringBuilder postorder = new StringBuilder();

    private static void solution(char node) {
        if (node != '.') {
            preorder.append(node);
            solution(tree.get(node).left);
            inorder.append(node);
            solution(tree.get(node).right);
            postorder.append(node);
        }
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}