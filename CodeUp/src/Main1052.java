import java.util.Scanner;

public class Main1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long j = sc.nextLong();

        int result = (i!=j) ? 1 : 0;
        System.out.println(result);
    }
}
