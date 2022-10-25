import java.util.Arrays;

public class IsSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{10, 99, 123, 7};

        int[] sample = new int[]{7, 99, 123, 10};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        Arrays.sort(base); // binarySearch 메서드는 오름차순으로 정렬을 해준다음 사용해야 정상적으로 동작한다

        for (int i : sample) {
            if (Arrays.binarySearch(base, i) < 0) return false;
        }
        return true;
    }
}
