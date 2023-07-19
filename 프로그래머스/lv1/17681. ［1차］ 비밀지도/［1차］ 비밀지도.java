class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder binary1 = new StringBuilder(Integer.toBinaryString(Math.max(arr1[i], arr2[i]))).reverse();
            StringBuilder binary2 = new StringBuilder(Integer.toBinaryString(Math.min(arr1[i], arr2[i]))).reverse();

            for (int j = 0; j < binary2.length(); j++) {
                if (binary1.charAt(j) != binary2.charAt(j) && binary2.charAt(j) == '1') {
                    binary1.setCharAt(j, '1');
                }
            }

            while (binary1.length() < n) {
                binary1.append("0");
            }

            answer[i] = binary1.reverse().toString().replace("1", "#").replaceAll("0", " ");
        }

        return answer;
    }
}