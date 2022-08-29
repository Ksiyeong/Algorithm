import java.util.Scanner;

public class Main1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        System.out.printf("%.2f",Math.round(input*100)/100.0);
    }
}