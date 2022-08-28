import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] result = input.split(" ");
        int n1 = Integer.parseInt(result[0]);
        int n2 = Integer.parseInt(result[1]);
        System.out.printf("%d %d",n1,n2);
    }
}