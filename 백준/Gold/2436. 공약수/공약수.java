import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        solution(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
    }

    static void solution(int gcd, int lcm) {
        long ab = (long) gcd * lcm;
        int A = gcd;
        int B = lcm;
        for (int a = gcd; a <= Math.sqrt(ab); a += gcd) {
            if (ab % a == 0) {
                int b = (int) (ab / a);
                if (getGCD(a, b) == gcd) {
                    if (A + B > a + b) {
                        A = a;
                        B = b;
                    }
                }
            }
        }
        System.out.println(A + " " + B);
    }

    static long getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }
}