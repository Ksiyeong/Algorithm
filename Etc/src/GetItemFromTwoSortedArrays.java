public class GetItemFromTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 8, 10};
        int[] arr2 = new int[]{2, 3, 5, 9};
        int result = getItemFromTwoSortedArrays(arr1, arr2, 6);
        System.out.println(result); // --> 8

        arr1 = new int[]{1, 1, 2, 10};
        arr2 = new int[]{3, 3};
        result = getItemFromTwoSortedArrays(arr1, arr2, 4);
        System.out.println(result); // --> 3
    }

    public static int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
        // TODO:
        int index1 = 0;
        int index2 = 0;
        int nowCount = 0;
        int nowNum = 0;

        while (nowCount != k) {

            if (arr1[index1] < arr2[index2]) {
                nowNum = arr1[index1];
                index1 += 1;
            } else {
                nowNum = arr2[index2];
                index2 += 1;
            }

            nowCount += 1;
        }

        return nowNum;
    }
}
