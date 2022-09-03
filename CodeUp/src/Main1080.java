import java.util.Scanner;

public class Main1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = 0;
        int i = 1;
        while (total < a) {
            total += i;
            i += 1;
        }
        System.out.println(i-1);
    }
}


