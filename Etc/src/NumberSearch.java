import java.util.Arrays;

public class NumberSearch {
    public static void main(String[] args) {
        int output = numberSearch("");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    static public int numberSearch(String str) {
        // TODO:
        if (str.length() == 0) return 0;

        int pureStrLength = str.replaceAll("[0-9]|\\s", "").length();
        int pureNumber = Arrays.stream(str.replaceAll("\\D", "").split(""))
                .map(i -> Integer.parseInt(i))
                .mapToInt(i -> i)
                .sum();

        int result = Integer.parseInt(String.format("%.0f", (float) pureNumber / pureStrLength));
        return result;
    }
}
