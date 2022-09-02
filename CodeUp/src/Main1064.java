import java.util.Scanner;

public class Main1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        System.out.println((i > j ? j : i) > k ? k : (i > j ? j : i));
    }
}
