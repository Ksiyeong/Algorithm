import java.util.Scanner;

public class Main1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double i = sc.nextDouble();

        System.out.printf("%.11f", Math.round(i*100000000000.0)/100000000000.0);
    }
}