import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long j = sc.nextLong();
        long k = sc.nextLong();
        long sum = i+j+k;
        System.out.println(sum);
        System.out.printf("%.1f", 1.0*sum/3);

    }
}