import java.util.Scanner;

public class Main1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("");

        for (String s : input) {
            System.out.println(String.format("\'%s\'", s));
        }
    }
}