package S10재귀;

import java.io.*;

public class No3B2_25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            recursionCount = 0;
            bw.write(isPalindrome(br.readLine()) + " " + recursionCount + "\n");
        }
        bw.flush();
    }

    static int recursionCount;
    public static int recursion(String s, int l, int r) {
        recursionCount += 1;
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}
