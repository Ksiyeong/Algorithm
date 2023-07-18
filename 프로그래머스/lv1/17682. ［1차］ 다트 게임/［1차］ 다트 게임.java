class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        // 사용하기 편리하게 split, 숫자부분의 경우 맨처음 *이 나오는 경우를 위해 +1하여 생성
        int[] numbers = splitNumbers(dartResult);
        String[] symbols = dartResult.split("\\d{1,2}");
        for (int i = 1; i < numbers.length; i++) {
            // SDT 계산
            if (symbols[i].startsWith("D")) {
                numbers[i] = numbers[i] * numbers[i];
            } else if (symbols[i].startsWith("T")) {
                numbers[i] = numbers[i] * numbers[i] * numbers[i];
            }

            // *# 계산
            if (symbols[i].contains("*")) {
                numbers[i] *= 2;
                numbers[i - 1] *= 2;
            } else if (symbols[i].contains("#")) {
                numbers[i] *= -1;
            }

        }
        
        // 결과 합산
        for (int i = 1; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer;
    }

    int[] splitNumbers(String dartResult) {
        String[] arr = dartResult.split("\\D+");
        int[] numbers = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            numbers[i + 1] = Integer.parseInt(arr[i]);
        }
        return numbers;
    }
}