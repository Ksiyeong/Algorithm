import java.util.Scanner;

public class Main1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("");

        System.out.println(String.format("[%s0000]", input[0]));
        System.out.println(String.format("[%s000]", input[1]));
        System.out.println(String.format("[%s00]", input[2]));
        System.out.println(String.format("[%s0]", input[3]));
        System.out.println(String.format("[%s]", input[4]));

    }
}