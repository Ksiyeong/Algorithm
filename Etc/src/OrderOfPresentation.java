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
        boolean[] isUsed = new boolean[N + 1];
        int count = 0;


        for (int i = 0; i < K.length; i++) {
        }


        return count;
    }


}
