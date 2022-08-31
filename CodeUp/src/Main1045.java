import java.util.Scanner;

public class Main1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long j = sc.nextLong();


        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
        System.out.printf("%.2f", 1.0*i/j);

    }
}