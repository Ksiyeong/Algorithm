import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OrderOfPresentation {
    public static void main(String[] args) {
        int output = orderOfPresentation(3, new int[]{2, 3, 1});
        System.out.println(output); // 3

//        output = orderOfPresentation(5, new int[]{1, 3, 2, 4, 5});
//        System.out.println(output); // 6
    }


    public static int orderOfPresentation(int N, int[] K) {
        // TODO:
        List<int[]> list = new ArrayList<>();
        int[] arr = IntStream.range(1, N + 1).toArray();
        int numberOfCases = Arrays.stream(arr).reduce((x, y) -> x * y).getAsInt();

        int count = 0;

        return numberOfCases;
    }


}
