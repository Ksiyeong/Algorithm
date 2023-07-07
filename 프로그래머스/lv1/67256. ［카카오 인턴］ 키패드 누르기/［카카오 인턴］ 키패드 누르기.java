class Solution {
    private final int[][] keypad = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
    private final String L = "L";
    private final String R = "R";

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int[] leftHand = new int[]{3, 0};
        int[] rightHand = new int[]{3, 2};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number == 1 || number == 4 || number == 7) {
                answer.append(L);
                leftHand = keypad[number];

            } else if (number == 3 || number == 6 || number == 9) {
                answer.append(R);
                rightHand = keypad[number];

            } else {
                int[] target = keypad[number];
                int leftDistance = getDistance(leftHand, target);
                int rightDistance = getDistance(rightHand, target);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    answer.append(L);
                    leftHand = target;
                } else {
                    answer.append(R);
                    rightHand = target;
                }
            }
        }

        return answer.toString();
    }

    private int getDistance(int[] hand, int[] target) {
        return Math.abs(hand[0] - target[0]) + Math.abs(hand[1] - target[1]);
    }
}