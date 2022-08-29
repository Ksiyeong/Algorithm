import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] result = input.split(" ");
        String n1 = result[0];
        String n2 = result[1];
        System.out.printf("%s %s",n2,n1);
    }
}